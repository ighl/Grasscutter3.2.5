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

public final class SceneForceUnlockNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneForceUnlockNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneForceUnlockNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneForceUnlockNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneForceUnlockNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cSceneForceUnlockNotify.proto\"?\n\u0016SceneForceUnlockNotify\u0012\u000e\n\u0006is_add\u0018\u0006 \u0001(\b\u0012\u0015\n\rforce_id_list\u0018\b \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneForceUnlockNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SceneForceUnlockNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneForceUnlockNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneForceUnlockNotifyOuterClass.internal_static_SceneForceUnlockNotify_descriptor, new String[] { "IsAdd", "ForceIdList" });
    }
    
    public static final class SceneForceUnlockNotify extends GeneratedMessageV3 implements SceneForceUnlockNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_ADD_FIELD_NUMBER = 6;
        private boolean isAdd_;
        public static final int FORCE_ID_LIST_FIELD_NUMBER = 8;
        private Internal.IntList forceIdList_;
        private int forceIdListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final SceneForceUnlockNotify DEFAULT_INSTANCE;
        private static final Parser<SceneForceUnlockNotify> PARSER;
        
        private SceneForceUnlockNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.forceIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private SceneForceUnlockNotify() {
            this.forceIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.forceIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneForceUnlockNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneForceUnlockNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 48: {
                            this.isAdd_ = input.readBool();
                            continue;
                        }
                        case 64: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.forceIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.forceIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 66: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.forceIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.forceIdList_.addInt(input.readUInt32());
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
                    this.forceIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SceneForceUnlockNotifyOuterClass.internal_static_SceneForceUnlockNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneForceUnlockNotifyOuterClass.internal_static_SceneForceUnlockNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneForceUnlockNotify.class, Builder.class);
        }
        
        @Override
        public boolean getIsAdd() {
            return this.isAdd_;
        }
        
        @Override
        public List<Integer> getForceIdListList() {
            return this.forceIdList_;
        }
        
        @Override
        public int getForceIdListCount() {
            return this.forceIdList_.size();
        }
        
        @Override
        public int getForceIdList(final int index) {
            return this.forceIdList_.getInt(index);
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
            if (this.isAdd_) {
                output.writeBool(6, this.isAdd_);
            }
            if (this.getForceIdListList().size() > 0) {
                output.writeUInt32NoTag(66);
                output.writeUInt32NoTag(this.forceIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.forceIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.forceIdList_.getInt(i));
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
            if (this.isAdd_) {
                size += CodedOutputStream.computeBoolSize(6, this.isAdd_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.forceIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.forceIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getForceIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.forceIdListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneForceUnlockNotify)) {
                return super.equals(obj);
            }
            final SceneForceUnlockNotify other = (SceneForceUnlockNotify)obj;
            return this.getIsAdd() == other.getIsAdd() && this.getForceIdListList().equals(other.getForceIdListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashBoolean(this.getIsAdd());
            if (this.getForceIdListCount() > 0) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getForceIdListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneForceUnlockNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneForceUnlockNotify.PARSER.parseFrom(data);
        }
        
        public static SceneForceUnlockNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneForceUnlockNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneForceUnlockNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneForceUnlockNotify.PARSER.parseFrom(data);
        }
        
        public static SceneForceUnlockNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneForceUnlockNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneForceUnlockNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneForceUnlockNotify.PARSER.parseFrom(data);
        }
        
        public static SceneForceUnlockNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneForceUnlockNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneForceUnlockNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneForceUnlockNotify.PARSER, input);
        }
        
        public static SceneForceUnlockNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneForceUnlockNotify.PARSER, input, extensionRegistry);
        }
        
        public static SceneForceUnlockNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneForceUnlockNotify.PARSER, input);
        }
        
        public static SceneForceUnlockNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneForceUnlockNotify.PARSER, input, extensionRegistry);
        }
        
        public static SceneForceUnlockNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneForceUnlockNotify.PARSER, input);
        }
        
        public static SceneForceUnlockNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneForceUnlockNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneForceUnlockNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneForceUnlockNotify prototype) {
            return SceneForceUnlockNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneForceUnlockNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneForceUnlockNotify getDefaultInstance() {
            return SceneForceUnlockNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneForceUnlockNotify> parser() {
            return SceneForceUnlockNotify.PARSER;
        }
        
        @Override
        public Parser<SceneForceUnlockNotify> getParserForType() {
            return SceneForceUnlockNotify.PARSER;
        }
        
        @Override
        public SceneForceUnlockNotify getDefaultInstanceForType() {
            return SceneForceUnlockNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneForceUnlockNotify();
            PARSER = new AbstractParser<SceneForceUnlockNotify>() {
                @Override
                public SceneForceUnlockNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneForceUnlockNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneForceUnlockNotifyOrBuilder
        {
            private int bitField0_;
            private boolean isAdd_;
            private Internal.IntList forceIdList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneForceUnlockNotifyOuterClass.internal_static_SceneForceUnlockNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneForceUnlockNotifyOuterClass.internal_static_SceneForceUnlockNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneForceUnlockNotify.class, Builder.class);
            }
            
            private Builder() {
                this.forceIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.forceIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneForceUnlockNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isAdd_ = false;
                this.forceIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneForceUnlockNotifyOuterClass.internal_static_SceneForceUnlockNotify_descriptor;
            }
            
            @Override
            public SceneForceUnlockNotify getDefaultInstanceForType() {
                return SceneForceUnlockNotify.getDefaultInstance();
            }
            
            @Override
            public SceneForceUnlockNotify build() {
                final SceneForceUnlockNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneForceUnlockNotify buildPartial() {
                final SceneForceUnlockNotify result = new SceneForceUnlockNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.isAdd_ = this.isAdd_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.forceIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.forceIdList_ = this.forceIdList_;
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
                if (other instanceof SceneForceUnlockNotify) {
                    return this.mergeFrom((SceneForceUnlockNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneForceUnlockNotify other) {
                if (other == SceneForceUnlockNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsAdd()) {
                    this.setIsAdd(other.getIsAdd());
                }
                if (!other.forceIdList_.isEmpty()) {
                    if (this.forceIdList_.isEmpty()) {
                        this.forceIdList_ = other.forceIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureForceIdListIsMutable();
                        this.forceIdList_.addAll(other.forceIdList_);
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
                SceneForceUnlockNotify parsedMessage = null;
                try {
                    parsedMessage = SceneForceUnlockNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneForceUnlockNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public boolean getIsAdd() {
                return this.isAdd_;
            }
            
            public Builder setIsAdd(final boolean value) {
                this.isAdd_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsAdd() {
                this.isAdd_ = false;
                this.onChanged();
                return this;
            }
            
            private void ensureForceIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.forceIdList_ = GeneratedMessageV3.mutableCopy(this.forceIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getForceIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.forceIdList_) : this.forceIdList_;
            }
            
            @Override
            public int getForceIdListCount() {
                return this.forceIdList_.size();
            }
            
            @Override
            public int getForceIdList(final int index) {
                return this.forceIdList_.getInt(index);
            }
            
            public Builder setForceIdList(final int index, final int value) {
                this.ensureForceIdListIsMutable();
                this.forceIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addForceIdList(final int value) {
                this.ensureForceIdListIsMutable();
                this.forceIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllForceIdList(final Iterable<? extends Integer> values) {
                this.ensureForceIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.forceIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearForceIdList() {
                this.forceIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
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
    
    public interface SceneForceUnlockNotifyOrBuilder extends MessageOrBuilder
    {
        boolean getIsAdd();
        
        List<Integer> getForceIdListList();
        
        int getForceIdListCount();
        
        int getForceIdList(final int p0);
    }
}
