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

public final class HomeGetArrangementInfoReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeGetArrangementInfoReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeGetArrangementInfoReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeGetArrangementInfoReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeGetArrangementInfoReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fHomeGetArrangementInfoReq.proto\"2\n\u0019HomeGetArrangementInfoReq\u0012\u0015\n\rscene_id_list\u0018\r \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeGetArrangementInfoReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_HomeGetArrangementInfoReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeGetArrangementInfoReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeGetArrangementInfoReqOuterClass.internal_static_HomeGetArrangementInfoReq_descriptor, new String[] { "SceneIdList" });
    }
    
    public static final class HomeGetArrangementInfoReq extends GeneratedMessageV3 implements HomeGetArrangementInfoReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SCENE_ID_LIST_FIELD_NUMBER = 13;
        private Internal.IntList sceneIdList_;
        private int sceneIdListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final HomeGetArrangementInfoReq DEFAULT_INSTANCE;
        private static final Parser<HomeGetArrangementInfoReq> PARSER;
        
        private HomeGetArrangementInfoReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sceneIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private HomeGetArrangementInfoReq() {
            this.sceneIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.sceneIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeGetArrangementInfoReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeGetArrangementInfoReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 104: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.sceneIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.sceneIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 106: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.sceneIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.sceneIdList_.addInt(input.readUInt32());
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
                    this.sceneIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return HomeGetArrangementInfoReqOuterClass.internal_static_HomeGetArrangementInfoReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeGetArrangementInfoReqOuterClass.internal_static_HomeGetArrangementInfoReq_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeGetArrangementInfoReq.class, Builder.class);
        }
        
        @Override
        public List<Integer> getSceneIdListList() {
            return this.sceneIdList_;
        }
        
        @Override
        public int getSceneIdListCount() {
            return this.sceneIdList_.size();
        }
        
        @Override
        public int getSceneIdList(final int index) {
            return this.sceneIdList_.getInt(index);
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
            if (this.getSceneIdListList().size() > 0) {
                output.writeUInt32NoTag(106);
                output.writeUInt32NoTag(this.sceneIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.sceneIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.sceneIdList_.getInt(i));
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
            for (int i = 0; i < this.sceneIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.sceneIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getSceneIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.sceneIdListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeGetArrangementInfoReq)) {
                return super.equals(obj);
            }
            final HomeGetArrangementInfoReq other = (HomeGetArrangementInfoReq)obj;
            return this.getSceneIdListList().equals(other.getSceneIdListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getSceneIdListCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getSceneIdListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeGetArrangementInfoReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeGetArrangementInfoReq.PARSER.parseFrom(data);
        }
        
        public static HomeGetArrangementInfoReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeGetArrangementInfoReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeGetArrangementInfoReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeGetArrangementInfoReq.PARSER.parseFrom(data);
        }
        
        public static HomeGetArrangementInfoReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeGetArrangementInfoReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeGetArrangementInfoReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeGetArrangementInfoReq.PARSER.parseFrom(data);
        }
        
        public static HomeGetArrangementInfoReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeGetArrangementInfoReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeGetArrangementInfoReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeGetArrangementInfoReq.PARSER, input);
        }
        
        public static HomeGetArrangementInfoReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeGetArrangementInfoReq.PARSER, input, extensionRegistry);
        }
        
        public static HomeGetArrangementInfoReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeGetArrangementInfoReq.PARSER, input);
        }
        
        public static HomeGetArrangementInfoReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeGetArrangementInfoReq.PARSER, input, extensionRegistry);
        }
        
        public static HomeGetArrangementInfoReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeGetArrangementInfoReq.PARSER, input);
        }
        
        public static HomeGetArrangementInfoReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeGetArrangementInfoReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeGetArrangementInfoReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeGetArrangementInfoReq prototype) {
            return HomeGetArrangementInfoReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeGetArrangementInfoReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeGetArrangementInfoReq getDefaultInstance() {
            return HomeGetArrangementInfoReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeGetArrangementInfoReq> parser() {
            return HomeGetArrangementInfoReq.PARSER;
        }
        
        @Override
        public Parser<HomeGetArrangementInfoReq> getParserForType() {
            return HomeGetArrangementInfoReq.PARSER;
        }
        
        @Override
        public HomeGetArrangementInfoReq getDefaultInstanceForType() {
            return HomeGetArrangementInfoReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeGetArrangementInfoReq();
            PARSER = new AbstractParser<HomeGetArrangementInfoReq>() {
                @Override
                public HomeGetArrangementInfoReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeGetArrangementInfoReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeGetArrangementInfoReqOrBuilder
        {
            private int bitField0_;
            private Internal.IntList sceneIdList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeGetArrangementInfoReqOuterClass.internal_static_HomeGetArrangementInfoReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeGetArrangementInfoReqOuterClass.internal_static_HomeGetArrangementInfoReq_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeGetArrangementInfoReq.class, Builder.class);
            }
            
            private Builder() {
                this.sceneIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.sceneIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeGetArrangementInfoReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.sceneIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeGetArrangementInfoReqOuterClass.internal_static_HomeGetArrangementInfoReq_descriptor;
            }
            
            @Override
            public HomeGetArrangementInfoReq getDefaultInstanceForType() {
                return HomeGetArrangementInfoReq.getDefaultInstance();
            }
            
            @Override
            public HomeGetArrangementInfoReq build() {
                final HomeGetArrangementInfoReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeGetArrangementInfoReq buildPartial() {
                final HomeGetArrangementInfoReq result = new HomeGetArrangementInfoReq(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.sceneIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.sceneIdList_ = this.sceneIdList_;
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
                if (other instanceof HomeGetArrangementInfoReq) {
                    return this.mergeFrom((HomeGetArrangementInfoReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeGetArrangementInfoReq other) {
                if (other == HomeGetArrangementInfoReq.getDefaultInstance()) {
                    return this;
                }
                if (!other.sceneIdList_.isEmpty()) {
                    if (this.sceneIdList_.isEmpty()) {
                        this.sceneIdList_ = other.sceneIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureSceneIdListIsMutable();
                        this.sceneIdList_.addAll(other.sceneIdList_);
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
                HomeGetArrangementInfoReq parsedMessage = null;
                try {
                    parsedMessage = HomeGetArrangementInfoReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeGetArrangementInfoReq)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureSceneIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.sceneIdList_ = GeneratedMessageV3.mutableCopy(this.sceneIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getSceneIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.sceneIdList_) : this.sceneIdList_;
            }
            
            @Override
            public int getSceneIdListCount() {
                return this.sceneIdList_.size();
            }
            
            @Override
            public int getSceneIdList(final int index) {
                return this.sceneIdList_.getInt(index);
            }
            
            public Builder setSceneIdList(final int index, final int value) {
                this.ensureSceneIdListIsMutable();
                this.sceneIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addSceneIdList(final int value) {
                this.ensureSceneIdListIsMutable();
                this.sceneIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllSceneIdList(final Iterable<? extends Integer> values) {
                this.ensureSceneIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.sceneIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearSceneIdList() {
                this.sceneIdList_ = GeneratedMessageV3.emptyIntList();
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
    
    public interface HomeGetArrangementInfoReqOrBuilder extends MessageOrBuilder
    {
        List<Integer> getSceneIdListList();
        
        int getSceneIdListCount();
        
        int getSceneIdList(final int p0);
    }
}
