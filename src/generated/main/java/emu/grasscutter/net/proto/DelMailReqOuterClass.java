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

public final class DelMailReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_DelMailReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DelMailReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private DelMailReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return DelMailReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010DelMailReq.proto\"\"\n\nDelMailReq\u0012\u0014\n\fmail_id_list\u0018\f \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        DelMailReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_DelMailReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_DelMailReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(DelMailReqOuterClass.internal_static_DelMailReq_descriptor, new String[] { "MailIdList" });
    }
    
    public static final class DelMailReq extends GeneratedMessageV3 implements DelMailReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MAIL_ID_LIST_FIELD_NUMBER = 12;
        private Internal.IntList mailIdList_;
        private int mailIdListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final DelMailReq DEFAULT_INSTANCE;
        private static final Parser<DelMailReq> PARSER;
        
        private DelMailReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.mailIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private DelMailReq() {
            this.mailIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.mailIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new DelMailReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private DelMailReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 96: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.mailIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.mailIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 98: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.mailIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.mailIdList_.addInt(input.readUInt32());
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
                    this.mailIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return DelMailReqOuterClass.internal_static_DelMailReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return DelMailReqOuterClass.internal_static_DelMailReq_fieldAccessorTable.ensureFieldAccessorsInitialized(DelMailReq.class, Builder.class);
        }
        
        @Override
        public List<Integer> getMailIdListList() {
            return this.mailIdList_;
        }
        
        @Override
        public int getMailIdListCount() {
            return this.mailIdList_.size();
        }
        
        @Override
        public int getMailIdList(final int index) {
            return this.mailIdList_.getInt(index);
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
            if (this.getMailIdListList().size() > 0) {
                output.writeUInt32NoTag(98);
                output.writeUInt32NoTag(this.mailIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.mailIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.mailIdList_.getInt(i));
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
            for (int i = 0; i < this.mailIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.mailIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getMailIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.mailIdListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DelMailReq)) {
                return super.equals(obj);
            }
            final DelMailReq other = (DelMailReq)obj;
            return this.getMailIdListList().equals(other.getMailIdListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getMailIdListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getMailIdListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static DelMailReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return DelMailReq.PARSER.parseFrom(data);
        }
        
        public static DelMailReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DelMailReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DelMailReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return DelMailReq.PARSER.parseFrom(data);
        }
        
        public static DelMailReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DelMailReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DelMailReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return DelMailReq.PARSER.parseFrom(data);
        }
        
        public static DelMailReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DelMailReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DelMailReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DelMailReq.PARSER, input);
        }
        
        public static DelMailReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DelMailReq.PARSER, input, extensionRegistry);
        }
        
        public static DelMailReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DelMailReq.PARSER, input);
        }
        
        public static DelMailReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DelMailReq.PARSER, input, extensionRegistry);
        }
        
        public static DelMailReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DelMailReq.PARSER, input);
        }
        
        public static DelMailReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DelMailReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return DelMailReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final DelMailReq prototype) {
            return DelMailReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == DelMailReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static DelMailReq getDefaultInstance() {
            return DelMailReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<DelMailReq> parser() {
            return DelMailReq.PARSER;
        }
        
        @Override
        public Parser<DelMailReq> getParserForType() {
            return DelMailReq.PARSER;
        }
        
        @Override
        public DelMailReq getDefaultInstanceForType() {
            return DelMailReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new DelMailReq();
            PARSER = new AbstractParser<DelMailReq>() {
                @Override
                public DelMailReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new DelMailReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DelMailReqOrBuilder
        {
            private int bitField0_;
            private Internal.IntList mailIdList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return DelMailReqOuterClass.internal_static_DelMailReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return DelMailReqOuterClass.internal_static_DelMailReq_fieldAccessorTable.ensureFieldAccessorsInitialized(DelMailReq.class, Builder.class);
            }
            
            private Builder() {
                this.mailIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.mailIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (DelMailReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.mailIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return DelMailReqOuterClass.internal_static_DelMailReq_descriptor;
            }
            
            @Override
            public DelMailReq getDefaultInstanceForType() {
                return DelMailReq.getDefaultInstance();
            }
            
            @Override
            public DelMailReq build() {
                final DelMailReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public DelMailReq buildPartial() {
                final DelMailReq result = new DelMailReq(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.mailIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.mailIdList_ = this.mailIdList_;
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
                if (other instanceof DelMailReq) {
                    return this.mergeFrom((DelMailReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final DelMailReq other) {
                if (other == DelMailReq.getDefaultInstance()) {
                    return this;
                }
                if (!other.mailIdList_.isEmpty()) {
                    if (this.mailIdList_.isEmpty()) {
                        this.mailIdList_ = other.mailIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureMailIdListIsMutable();
                        this.mailIdList_.addAll(other.mailIdList_);
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
                DelMailReq parsedMessage = null;
                try {
                    parsedMessage = DelMailReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (DelMailReq)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureMailIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.mailIdList_ = GeneratedMessageV3.mutableCopy(this.mailIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getMailIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.mailIdList_) : this.mailIdList_;
            }
            
            @Override
            public int getMailIdListCount() {
                return this.mailIdList_.size();
            }
            
            @Override
            public int getMailIdList(final int index) {
                return this.mailIdList_.getInt(index);
            }
            
            public Builder setMailIdList(final int index, final int value) {
                this.ensureMailIdListIsMutable();
                this.mailIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addMailIdList(final int value) {
                this.ensureMailIdListIsMutable();
                this.mailIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllMailIdList(final Iterable<? extends Integer> values) {
                this.ensureMailIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.mailIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearMailIdList() {
                this.mailIdList_ = GeneratedMessageV3.emptyIntList();
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
    
    public interface DelMailReqOrBuilder extends MessageOrBuilder
    {
        List<Integer> getMailIdListList();
        
        int getMailIdListCount();
        
        int getMailIdList(final int p0);
    }
}
