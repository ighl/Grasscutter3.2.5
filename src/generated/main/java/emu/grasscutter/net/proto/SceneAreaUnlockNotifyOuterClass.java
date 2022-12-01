// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class SceneAreaUnlockNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneAreaUnlockNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneAreaUnlockNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneAreaUnlockNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneAreaUnlockNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bSceneAreaUnlockNotify.proto\"<\n\u0015SceneAreaUnlockNotify\u0012\u0011\n\tarea_list\u0018\n \u0003(\r\u0012\u0010\n\bscene_id\u0018\t \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneAreaUnlockNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SceneAreaUnlockNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneAreaUnlockNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneAreaUnlockNotifyOuterClass.internal_static_SceneAreaUnlockNotify_descriptor, new String[] { "AreaList", "SceneId" });
    }
    
    public static final class SceneAreaUnlockNotify extends GeneratedMessageV3 implements SceneAreaUnlockNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AREA_LIST_FIELD_NUMBER = 10;
        private Internal.IntList areaList_;
        private int areaListMemoizedSerializedSize;
        public static final int SCENE_ID_FIELD_NUMBER = 9;
        private int sceneId_;
        private byte memoizedIsInitialized;
        private static final SceneAreaUnlockNotify DEFAULT_INSTANCE;
        private static final Parser<SceneAreaUnlockNotify> PARSER;
        
        private SceneAreaUnlockNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.areaListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private SceneAreaUnlockNotify() {
            this.areaListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.areaList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneAreaUnlockNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneAreaUnlockNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 72: {
                            this.sceneId_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.areaList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.areaList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 82: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.areaList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.areaList_.addInt(input.readUInt32());
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
                    this.areaList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SceneAreaUnlockNotifyOuterClass.internal_static_SceneAreaUnlockNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneAreaUnlockNotifyOuterClass.internal_static_SceneAreaUnlockNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneAreaUnlockNotify.class, Builder.class);
        }
        
        @Override
        public List<Integer> getAreaListList() {
            return this.areaList_;
        }
        
        @Override
        public int getAreaListCount() {
            return this.areaList_.size();
        }
        
        @Override
        public int getAreaList(final int index) {
            return this.areaList_.getInt(index);
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
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
            if (this.sceneId_ != 0) {
                output.writeUInt32(9, this.sceneId_);
            }
            if (this.getAreaListList().size() > 0) {
                output.writeUInt32NoTag(82);
                output.writeUInt32NoTag(this.areaListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.areaList_.size(); ++i) {
                output.writeUInt32NoTag(this.areaList_.getInt(i));
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
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.sceneId_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.areaList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.areaList_.getInt(i));
            }
            size += dataSize;
            if (!this.getAreaListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.areaListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneAreaUnlockNotify)) {
                return super.equals(obj);
            }
            final SceneAreaUnlockNotify other = (SceneAreaUnlockNotify)obj;
            return this.getAreaListList().equals(other.getAreaListList()) && this.getSceneId() == other.getSceneId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getAreaListCount() > 0) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getAreaListList().hashCode();
            }
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getSceneId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneAreaUnlockNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneAreaUnlockNotify.PARSER.parseFrom(data);
        }
        
        public static SceneAreaUnlockNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneAreaUnlockNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneAreaUnlockNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneAreaUnlockNotify.PARSER.parseFrom(data);
        }
        
        public static SceneAreaUnlockNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneAreaUnlockNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneAreaUnlockNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneAreaUnlockNotify.PARSER.parseFrom(data);
        }
        
        public static SceneAreaUnlockNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneAreaUnlockNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneAreaUnlockNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneAreaUnlockNotify.PARSER, input);
        }
        
        public static SceneAreaUnlockNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneAreaUnlockNotify.PARSER, input, extensionRegistry);
        }
        
        public static SceneAreaUnlockNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneAreaUnlockNotify.PARSER, input);
        }
        
        public static SceneAreaUnlockNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneAreaUnlockNotify.PARSER, input, extensionRegistry);
        }
        
        public static SceneAreaUnlockNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneAreaUnlockNotify.PARSER, input);
        }
        
        public static SceneAreaUnlockNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneAreaUnlockNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneAreaUnlockNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneAreaUnlockNotify prototype) {
            return SceneAreaUnlockNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneAreaUnlockNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneAreaUnlockNotify getDefaultInstance() {
            return SceneAreaUnlockNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneAreaUnlockNotify> parser() {
            return SceneAreaUnlockNotify.PARSER;
        }
        
        @Override
        public Parser<SceneAreaUnlockNotify> getParserForType() {
            return SceneAreaUnlockNotify.PARSER;
        }
        
        @Override
        public SceneAreaUnlockNotify getDefaultInstanceForType() {
            return SceneAreaUnlockNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneAreaUnlockNotify();
            PARSER = new AbstractParser<SceneAreaUnlockNotify>() {
                @Override
                public SceneAreaUnlockNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneAreaUnlockNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneAreaUnlockNotifyOrBuilder
        {
            private int bitField0_;
            private Internal.IntList areaList_;
            private int sceneId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneAreaUnlockNotifyOuterClass.internal_static_SceneAreaUnlockNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneAreaUnlockNotifyOuterClass.internal_static_SceneAreaUnlockNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneAreaUnlockNotify.class, Builder.class);
            }
            
            private Builder() {
                this.areaList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.areaList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneAreaUnlockNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.areaList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.sceneId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneAreaUnlockNotifyOuterClass.internal_static_SceneAreaUnlockNotify_descriptor;
            }
            
            @Override
            public SceneAreaUnlockNotify getDefaultInstanceForType() {
                return SceneAreaUnlockNotify.getDefaultInstance();
            }
            
            @Override
            public SceneAreaUnlockNotify build() {
                final SceneAreaUnlockNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneAreaUnlockNotify buildPartial() {
                final SceneAreaUnlockNotify result = new SceneAreaUnlockNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.areaList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.areaList_ = this.areaList_;
                result.sceneId_ = this.sceneId_;
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
                if (other instanceof SceneAreaUnlockNotify) {
                    return this.mergeFrom((SceneAreaUnlockNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneAreaUnlockNotify other) {
                if (other == SceneAreaUnlockNotify.getDefaultInstance()) {
                    return this;
                }
                if (!other.areaList_.isEmpty()) {
                    if (this.areaList_.isEmpty()) {
                        this.areaList_ = other.areaList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureAreaListIsMutable();
                        this.areaList_.addAll(other.areaList_);
                    }
                    this.onChanged();
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
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
                SceneAreaUnlockNotify parsedMessage = null;
                try {
                    parsedMessage = SceneAreaUnlockNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneAreaUnlockNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureAreaListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.areaList_ = GeneratedMessageV3.mutableCopy(this.areaList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getAreaListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.areaList_) : this.areaList_;
            }
            
            @Override
            public int getAreaListCount() {
                return this.areaList_.size();
            }
            
            @Override
            public int getAreaList(final int index) {
                return this.areaList_.getInt(index);
            }
            
            public Builder setAreaList(final int index, final int value) {
                this.ensureAreaListIsMutable();
                this.areaList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addAreaList(final int value) {
                this.ensureAreaListIsMutable();
                this.areaList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllAreaList(final Iterable<? extends Integer> values) {
                this.ensureAreaListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.areaList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearAreaList() {
                this.areaList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSceneId() {
                return this.sceneId_;
            }
            
            public Builder setSceneId(final int value) {
                this.sceneId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSceneId() {
                this.sceneId_ = 0;
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
    
    public interface SceneAreaUnlockNotifyOrBuilder extends MessageOrBuilder
    {
        List<Integer> getAreaListList();
        
        int getAreaListCount();
        
        int getAreaList(final int p0);
        
        int getSceneId();
    }
}
