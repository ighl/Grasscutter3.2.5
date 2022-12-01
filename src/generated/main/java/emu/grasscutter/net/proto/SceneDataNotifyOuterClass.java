// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import com.google.protobuf.ByteString;
import com.google.protobuf.ProtocolStringList;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class SceneDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneDataNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015SceneDataNotify.proto\"L\n\u000fSceneDataNotify\u0012\u001e\n\u0016level_config_name_list\u0018\u0007 \u0003(\t\u0012\u0019\n\u0011scene_tag_id_list\u0018\b \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SceneDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneDataNotifyOuterClass.internal_static_SceneDataNotify_descriptor, new String[] { "LevelConfigNameList", "SceneTagIdList" });
    }
    
    public static final class SceneDataNotify extends GeneratedMessageV3 implements SceneDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int LEVEL_CONFIG_NAME_LIST_FIELD_NUMBER = 7;
        private LazyStringList levelConfigNameList_;
        public static final int SCENE_TAG_ID_LIST_FIELD_NUMBER = 8;
        private Internal.IntList sceneTagIdList_;
        private int sceneTagIdListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final SceneDataNotify DEFAULT_INSTANCE;
        private static final Parser<SceneDataNotify> PARSER;
        
        private SceneDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sceneTagIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private SceneDataNotify() {
            this.sceneTagIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.levelConfigNameList_ = LazyStringArrayList.EMPTY;
            this.sceneTagIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 58: {
                            final String s = input.readStringRequireUtf8();
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.levelConfigNameList_ = new LazyStringArrayList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.levelConfigNameList_.add(s);
                            continue;
                        }
                        case 64: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.sceneTagIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.sceneTagIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 66: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.sceneTagIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.sceneTagIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.levelConfigNameList_ = this.levelConfigNameList_.getUnmodifiableView();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.sceneTagIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SceneDataNotifyOuterClass.internal_static_SceneDataNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneDataNotifyOuterClass.internal_static_SceneDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneDataNotify.class, Builder.class);
        }
        
        @Override
        public ProtocolStringList getLevelConfigNameListList() {
            return this.levelConfigNameList_;
        }
        
        @Override
        public int getLevelConfigNameListCount() {
            return this.levelConfigNameList_.size();
        }
        
        @Override
        public String getLevelConfigNameList(final int index) {
            return this.levelConfigNameList_.get(index);
        }
        
        @Override
        public ByteString getLevelConfigNameListBytes(final int index) {
            return this.levelConfigNameList_.getByteString(index);
        }
        
        @Override
        public List<Integer> getSceneTagIdListList() {
            return this.sceneTagIdList_;
        }
        
        @Override
        public int getSceneTagIdListCount() {
            return this.sceneTagIdList_.size();
        }
        
        @Override
        public int getSceneTagIdList(final int index) {
            return this.sceneTagIdList_.getInt(index);
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            this.getSerializedSize();
            for (int i = 0; i < this.levelConfigNameList_.size(); ++i) {
                GeneratedMessageV3.writeString(output, 7, this.levelConfigNameList_.getRaw(i));
            }
            if (this.getSceneTagIdListList().size() > 0) {
                output.writeUInt32NoTag(66);
                output.writeUInt32NoTag(this.sceneTagIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.sceneTagIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.sceneTagIdList_.getInt(i));
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            int dataSize = 0;
            for (int i = 0; i < this.levelConfigNameList_.size(); ++i) {
                dataSize += GeneratedMessageV3.computeStringSizeNoTag(this.levelConfigNameList_.getRaw(i));
            }
            size += dataSize;
            size += 1 * this.getLevelConfigNameListList().size();
            dataSize = 0;
            for (int i = 0; i < this.sceneTagIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.sceneTagIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getSceneTagIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.sceneTagIdListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneDataNotify)) {
                return super.equals(obj);
            }
            final SceneDataNotify other = (SceneDataNotify)obj;
            return this.getLevelConfigNameListList().equals(other.getLevelConfigNameListList()) && this.getSceneTagIdListList().equals(other.getSceneTagIdListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getLevelConfigNameListCount() > 0) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getLevelConfigNameListList().hashCode();
            }
            if (this.getSceneTagIdListCount() > 0) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getSceneTagIdListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneDataNotify.PARSER.parseFrom(data);
        }
        
        public static SceneDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneDataNotify.PARSER.parseFrom(data);
        }
        
        public static SceneDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneDataNotify.PARSER.parseFrom(data);
        }
        
        public static SceneDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneDataNotify.PARSER, input);
        }
        
        public static SceneDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static SceneDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneDataNotify.PARSER, input);
        }
        
        public static SceneDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static SceneDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneDataNotify.PARSER, input);
        }
        
        public static SceneDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneDataNotify prototype) {
            return SceneDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneDataNotify getDefaultInstance() {
            return SceneDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneDataNotify> parser() {
            return SceneDataNotify.PARSER;
        }
        
        @Override
        public Parser<SceneDataNotify> getParserForType() {
            return SceneDataNotify.PARSER;
        }
        
        @Override
        public SceneDataNotify getDefaultInstanceForType() {
            return SceneDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneDataNotify();
            PARSER = new AbstractParser<SceneDataNotify>() {
                @Override
                public SceneDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneDataNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneDataNotifyOrBuilder
        {
            private int bitField0_;
            private LazyStringList levelConfigNameList_;
            private Internal.IntList sceneTagIdList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneDataNotifyOuterClass.internal_static_SceneDataNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneDataNotifyOuterClass.internal_static_SceneDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.levelConfigNameList_ = LazyStringArrayList.EMPTY;
                this.sceneTagIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.levelConfigNameList_ = LazyStringArrayList.EMPTY;
                this.sceneTagIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneDataNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.levelConfigNameList_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= 0xFFFFFFFE;
                this.sceneTagIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneDataNotifyOuterClass.internal_static_SceneDataNotify_descriptor;
            }
            
            @Override
            public SceneDataNotify getDefaultInstanceForType() {
                return SceneDataNotify.getDefaultInstance();
            }
            
            @Override
            public SceneDataNotify build() {
                final SceneDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneDataNotify buildPartial() {
                final SceneDataNotify result = new SceneDataNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.levelConfigNameList_ = this.levelConfigNameList_.getUnmodifiableView();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.levelConfigNameList_ = this.levelConfigNameList_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.sceneTagIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.sceneTagIdList_ = this.sceneTagIdList_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof SceneDataNotify) {
                    return this.mergeFrom((SceneDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneDataNotify other) {
                if (other == SceneDataNotify.getDefaultInstance()) {
                    return this;
                }
                if (!other.levelConfigNameList_.isEmpty()) {
                    if (this.levelConfigNameList_.isEmpty()) {
                        this.levelConfigNameList_ = other.levelConfigNameList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureLevelConfigNameListIsMutable();
                        this.levelConfigNameList_.addAll(other.levelConfigNameList_);
                    }
                    this.onChanged();
                }
                if (!other.sceneTagIdList_.isEmpty()) {
                    if (this.sceneTagIdList_.isEmpty()) {
                        this.sceneTagIdList_ = other.sceneTagIdList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureSceneTagIdListIsMutable();
                        this.sceneTagIdList_.addAll(other.sceneTagIdList_);
                    }
                    this.onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                SceneDataNotify parsedMessage = null;
                try {
                    parsedMessage = SceneDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneDataNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureLevelConfigNameListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.levelConfigNameList_ = new LazyStringArrayList(this.levelConfigNameList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public ProtocolStringList getLevelConfigNameListList() {
                return this.levelConfigNameList_.getUnmodifiableView();
            }
            
            @Override
            public int getLevelConfigNameListCount() {
                return this.levelConfigNameList_.size();
            }
            
            @Override
            public String getLevelConfigNameList(final int index) {
                return this.levelConfigNameList_.get(index);
            }
            
            @Override
            public ByteString getLevelConfigNameListBytes(final int index) {
                return this.levelConfigNameList_.getByteString(index);
            }
            
            public Builder setLevelConfigNameList(final int index, final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureLevelConfigNameListIsMutable();
                this.levelConfigNameList_.set(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addLevelConfigNameList(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureLevelConfigNameListIsMutable();
                this.levelConfigNameList_.add(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllLevelConfigNameList(final Iterable<String> values) {
                this.ensureLevelConfigNameListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.levelConfigNameList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearLevelConfigNameList() {
                this.levelConfigNameList_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            public Builder addLevelConfigNameListBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.ensureLevelConfigNameListIsMutable();
                this.levelConfigNameList_.add(value);
                this.onChanged();
                return this;
            }
            
            private void ensureSceneTagIdListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.sceneTagIdList_ = GeneratedMessageV3.mutableCopy(this.sceneTagIdList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getSceneTagIdListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.sceneTagIdList_) : this.sceneTagIdList_;
            }
            
            @Override
            public int getSceneTagIdListCount() {
                return this.sceneTagIdList_.size();
            }
            
            @Override
            public int getSceneTagIdList(final int index) {
                return this.sceneTagIdList_.getInt(index);
            }
            
            public Builder setSceneTagIdList(final int index, final int value) {
                this.ensureSceneTagIdListIsMutable();
                this.sceneTagIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addSceneTagIdList(final int value) {
                this.ensureSceneTagIdListIsMutable();
                this.sceneTagIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllSceneTagIdList(final Iterable<? extends Integer> values) {
                this.ensureSceneTagIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.sceneTagIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearSceneTagIdList() {
                this.sceneTagIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface SceneDataNotifyOrBuilder extends MessageOrBuilder
    {
        List<String> getLevelConfigNameListList();
        
        int getLevelConfigNameListCount();
        
        String getLevelConfigNameList(final int p0);
        
        ByteString getLevelConfigNameListBytes(final int p0);
        
        List<Integer> getSceneTagIdListList();
        
        int getSceneTagIdListCount();
        
        int getSceneTagIdList(final int p0);
    }
}
