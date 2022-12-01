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

public final class DelTeamEntityNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_DelTeamEntityNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DelTeamEntityNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private DelTeamEntityNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return DelTeamEntityNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019DelTeamEntityNotify.proto\"C\n\u0013DelTeamEntityNotify\u0012\u001a\n\u0012del_entity_id_list\u0018\u000f \u0003(\r\u0012\u0010\n\bscene_id\u0018\b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        DelTeamEntityNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_DelTeamEntityNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_DelTeamEntityNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(DelTeamEntityNotifyOuterClass.internal_static_DelTeamEntityNotify_descriptor, new String[] { "DelEntityIdList", "SceneId" });
    }
    
    public static final class DelTeamEntityNotify extends GeneratedMessageV3 implements DelTeamEntityNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int DEL_ENTITY_ID_LIST_FIELD_NUMBER = 15;
        private Internal.IntList delEntityIdList_;
        private int delEntityIdListMemoizedSerializedSize;
        public static final int SCENE_ID_FIELD_NUMBER = 8;
        private int sceneId_;
        private byte memoizedIsInitialized;
        private static final DelTeamEntityNotify DEFAULT_INSTANCE;
        private static final Parser<DelTeamEntityNotify> PARSER;
        
        private DelTeamEntityNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.delEntityIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private DelTeamEntityNotify() {
            this.delEntityIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.delEntityIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new DelTeamEntityNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private DelTeamEntityNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 64: {
                            this.sceneId_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.delEntityIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.delEntityIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 122: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.delEntityIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.delEntityIdList_.addInt(input.readUInt32());
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
                    this.delEntityIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return DelTeamEntityNotifyOuterClass.internal_static_DelTeamEntityNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return DelTeamEntityNotifyOuterClass.internal_static_DelTeamEntityNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(DelTeamEntityNotify.class, Builder.class);
        }
        
        @Override
        public List<Integer> getDelEntityIdListList() {
            return this.delEntityIdList_;
        }
        
        @Override
        public int getDelEntityIdListCount() {
            return this.delEntityIdList_.size();
        }
        
        @Override
        public int getDelEntityIdList(final int index) {
            return this.delEntityIdList_.getInt(index);
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
                output.writeUInt32(8, this.sceneId_);
            }
            if (this.getDelEntityIdListList().size() > 0) {
                output.writeUInt32NoTag(122);
                output.writeUInt32NoTag(this.delEntityIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.delEntityIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.delEntityIdList_.getInt(i));
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
                size += CodedOutputStream.computeUInt32Size(8, this.sceneId_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.delEntityIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.delEntityIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getDelEntityIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.delEntityIdListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DelTeamEntityNotify)) {
                return super.equals(obj);
            }
            final DelTeamEntityNotify other = (DelTeamEntityNotify)obj;
            return this.getDelEntityIdListList().equals(other.getDelEntityIdListList()) && this.getSceneId() == other.getSceneId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getDelEntityIdListCount() > 0) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getDelEntityIdListList().hashCode();
            }
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getSceneId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static DelTeamEntityNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return DelTeamEntityNotify.PARSER.parseFrom(data);
        }
        
        public static DelTeamEntityNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DelTeamEntityNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DelTeamEntityNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return DelTeamEntityNotify.PARSER.parseFrom(data);
        }
        
        public static DelTeamEntityNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DelTeamEntityNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DelTeamEntityNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return DelTeamEntityNotify.PARSER.parseFrom(data);
        }
        
        public static DelTeamEntityNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DelTeamEntityNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DelTeamEntityNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DelTeamEntityNotify.PARSER, input);
        }
        
        public static DelTeamEntityNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DelTeamEntityNotify.PARSER, input, extensionRegistry);
        }
        
        public static DelTeamEntityNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DelTeamEntityNotify.PARSER, input);
        }
        
        public static DelTeamEntityNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DelTeamEntityNotify.PARSER, input, extensionRegistry);
        }
        
        public static DelTeamEntityNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DelTeamEntityNotify.PARSER, input);
        }
        
        public static DelTeamEntityNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DelTeamEntityNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return DelTeamEntityNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final DelTeamEntityNotify prototype) {
            return DelTeamEntityNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == DelTeamEntityNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static DelTeamEntityNotify getDefaultInstance() {
            return DelTeamEntityNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<DelTeamEntityNotify> parser() {
            return DelTeamEntityNotify.PARSER;
        }
        
        @Override
        public Parser<DelTeamEntityNotify> getParserForType() {
            return DelTeamEntityNotify.PARSER;
        }
        
        @Override
        public DelTeamEntityNotify getDefaultInstanceForType() {
            return DelTeamEntityNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new DelTeamEntityNotify();
            PARSER = new AbstractParser<DelTeamEntityNotify>() {
                @Override
                public DelTeamEntityNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new DelTeamEntityNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DelTeamEntityNotifyOrBuilder
        {
            private int bitField0_;
            private Internal.IntList delEntityIdList_;
            private int sceneId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return DelTeamEntityNotifyOuterClass.internal_static_DelTeamEntityNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return DelTeamEntityNotifyOuterClass.internal_static_DelTeamEntityNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(DelTeamEntityNotify.class, Builder.class);
            }
            
            private Builder() {
                this.delEntityIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.delEntityIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (DelTeamEntityNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.delEntityIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.sceneId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return DelTeamEntityNotifyOuterClass.internal_static_DelTeamEntityNotify_descriptor;
            }
            
            @Override
            public DelTeamEntityNotify getDefaultInstanceForType() {
                return DelTeamEntityNotify.getDefaultInstance();
            }
            
            @Override
            public DelTeamEntityNotify build() {
                final DelTeamEntityNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public DelTeamEntityNotify buildPartial() {
                final DelTeamEntityNotify result = new DelTeamEntityNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.delEntityIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.delEntityIdList_ = this.delEntityIdList_;
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
                if (other instanceof DelTeamEntityNotify) {
                    return this.mergeFrom((DelTeamEntityNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final DelTeamEntityNotify other) {
                if (other == DelTeamEntityNotify.getDefaultInstance()) {
                    return this;
                }
                if (!other.delEntityIdList_.isEmpty()) {
                    if (this.delEntityIdList_.isEmpty()) {
                        this.delEntityIdList_ = other.delEntityIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureDelEntityIdListIsMutable();
                        this.delEntityIdList_.addAll(other.delEntityIdList_);
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
                DelTeamEntityNotify parsedMessage = null;
                try {
                    parsedMessage = DelTeamEntityNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (DelTeamEntityNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureDelEntityIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.delEntityIdList_ = GeneratedMessageV3.mutableCopy(this.delEntityIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getDelEntityIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.delEntityIdList_) : this.delEntityIdList_;
            }
            
            @Override
            public int getDelEntityIdListCount() {
                return this.delEntityIdList_.size();
            }
            
            @Override
            public int getDelEntityIdList(final int index) {
                return this.delEntityIdList_.getInt(index);
            }
            
            public Builder setDelEntityIdList(final int index, final int value) {
                this.ensureDelEntityIdListIsMutable();
                this.delEntityIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addDelEntityIdList(final int value) {
                this.ensureDelEntityIdListIsMutable();
                this.delEntityIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllDelEntityIdList(final Iterable<? extends Integer> values) {
                this.ensureDelEntityIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.delEntityIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearDelEntityIdList() {
                this.delEntityIdList_ = GeneratedMessageV3.emptyIntList();
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
    
    public interface DelTeamEntityNotifyOrBuilder extends MessageOrBuilder
    {
        List<Integer> getDelEntityIdListList();
        
        int getDelEntityIdListCount();
        
        int getDelEntityIdList(final int p0);
        
        int getSceneId();
    }
}
