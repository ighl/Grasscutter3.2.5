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

public final class TryEnterHomeRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_TryEnterHomeRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TryEnterHomeRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TryEnterHomeRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TryEnterHomeRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015TryEnterHomeRsp.proto\"J\n\u000fTryEnterHomeRsp\u0012\u0012\n\ntarget_uid\u0018\u000f \u0001(\r\u0012\u000f\n\u0007retcode\u0018\u0004 \u0001(\u0005\u0012\u0012\n\nparam_list\u0018\n \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TryEnterHomeRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_TryEnterHomeRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TryEnterHomeRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TryEnterHomeRspOuterClass.internal_static_TryEnterHomeRsp_descriptor, new String[] { "TargetUid", "Retcode", "ParamList" });
    }
    
    public static final class TryEnterHomeRsp extends GeneratedMessageV3 implements TryEnterHomeRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TARGET_UID_FIELD_NUMBER = 15;
        private int targetUid_;
        public static final int RETCODE_FIELD_NUMBER = 4;
        private int retcode_;
        public static final int PARAM_LIST_FIELD_NUMBER = 10;
        private Internal.IntList paramList_;
        private int paramListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final TryEnterHomeRsp DEFAULT_INSTANCE;
        private static final Parser<TryEnterHomeRsp> PARSER;
        
        private TryEnterHomeRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.paramListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private TryEnterHomeRsp() {
            this.paramListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.paramList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TryEnterHomeRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TryEnterHomeRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 80: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.paramList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.paramList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 82: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.paramList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.paramList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 120: {
                            this.targetUid_ = input.readUInt32();
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
                    this.paramList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return TryEnterHomeRspOuterClass.internal_static_TryEnterHomeRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TryEnterHomeRspOuterClass.internal_static_TryEnterHomeRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(TryEnterHomeRsp.class, Builder.class);
        }
        
        @Override
        public int getTargetUid() {
            return this.targetUid_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public List<Integer> getParamListList() {
            return this.paramList_;
        }
        
        @Override
        public int getParamListCount() {
            return this.paramList_.size();
        }
        
        @Override
        public int getParamList(final int index) {
            return this.paramList_.getInt(index);
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
            if (this.retcode_ != 0) {
                output.writeInt32(4, this.retcode_);
            }
            if (this.getParamListList().size() > 0) {
                output.writeUInt32NoTag(82);
                output.writeUInt32NoTag(this.paramListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.paramList_.size(); ++i) {
                output.writeUInt32NoTag(this.paramList_.getInt(i));
            }
            if (this.targetUid_ != 0) {
                output.writeUInt32(15, this.targetUid_);
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(4, this.retcode_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.paramList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.paramList_.getInt(i));
            }
            size += dataSize;
            if (!this.getParamListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.paramListMemoizedSerializedSize = dataSize;
            if (this.targetUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.targetUid_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TryEnterHomeRsp)) {
                return super.equals(obj);
            }
            final TryEnterHomeRsp other = (TryEnterHomeRsp)obj;
            return this.getTargetUid() == other.getTargetUid() && this.getRetcode() == other.getRetcode() && this.getParamListList().equals(other.getParamListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getTargetUid();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getRetcode();
            if (this.getParamListCount() > 0) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getParamListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TryEnterHomeRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TryEnterHomeRsp.PARSER.parseFrom(data);
        }
        
        public static TryEnterHomeRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TryEnterHomeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TryEnterHomeRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TryEnterHomeRsp.PARSER.parseFrom(data);
        }
        
        public static TryEnterHomeRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TryEnterHomeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TryEnterHomeRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TryEnterHomeRsp.PARSER.parseFrom(data);
        }
        
        public static TryEnterHomeRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TryEnterHomeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TryEnterHomeRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TryEnterHomeRsp.PARSER, input);
        }
        
        public static TryEnterHomeRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TryEnterHomeRsp.PARSER, input, extensionRegistry);
        }
        
        public static TryEnterHomeRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TryEnterHomeRsp.PARSER, input);
        }
        
        public static TryEnterHomeRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TryEnterHomeRsp.PARSER, input, extensionRegistry);
        }
        
        public static TryEnterHomeRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TryEnterHomeRsp.PARSER, input);
        }
        
        public static TryEnterHomeRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TryEnterHomeRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TryEnterHomeRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TryEnterHomeRsp prototype) {
            return TryEnterHomeRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TryEnterHomeRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TryEnterHomeRsp getDefaultInstance() {
            return TryEnterHomeRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<TryEnterHomeRsp> parser() {
            return TryEnterHomeRsp.PARSER;
        }
        
        @Override
        public Parser<TryEnterHomeRsp> getParserForType() {
            return TryEnterHomeRsp.PARSER;
        }
        
        @Override
        public TryEnterHomeRsp getDefaultInstanceForType() {
            return TryEnterHomeRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TryEnterHomeRsp();
            PARSER = new AbstractParser<TryEnterHomeRsp>() {
                @Override
                public TryEnterHomeRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TryEnterHomeRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TryEnterHomeRspOrBuilder
        {
            private int bitField0_;
            private int targetUid_;
            private int retcode_;
            private Internal.IntList paramList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TryEnterHomeRspOuterClass.internal_static_TryEnterHomeRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TryEnterHomeRspOuterClass.internal_static_TryEnterHomeRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(TryEnterHomeRsp.class, Builder.class);
            }
            
            private Builder() {
                this.paramList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.paramList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TryEnterHomeRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.targetUid_ = 0;
                this.retcode_ = 0;
                this.paramList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TryEnterHomeRspOuterClass.internal_static_TryEnterHomeRsp_descriptor;
            }
            
            @Override
            public TryEnterHomeRsp getDefaultInstanceForType() {
                return TryEnterHomeRsp.getDefaultInstance();
            }
            
            @Override
            public TryEnterHomeRsp build() {
                final TryEnterHomeRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TryEnterHomeRsp buildPartial() {
                final TryEnterHomeRsp result = new TryEnterHomeRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.targetUid_ = this.targetUid_;
                result.retcode_ = this.retcode_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.paramList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.paramList_ = this.paramList_;
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
                if (other instanceof TryEnterHomeRsp) {
                    return this.mergeFrom((TryEnterHomeRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TryEnterHomeRsp other) {
                if (other == TryEnterHomeRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getTargetUid() != 0) {
                    this.setTargetUid(other.getTargetUid());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (!other.paramList_.isEmpty()) {
                    if (this.paramList_.isEmpty()) {
                        this.paramList_ = other.paramList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureParamListIsMutable();
                        this.paramList_.addAll(other.paramList_);
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
                TryEnterHomeRsp parsedMessage = null;
                try {
                    parsedMessage = TryEnterHomeRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TryEnterHomeRsp)e.getUnfinishedMessage();
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
            public int getTargetUid() {
                return this.targetUid_;
            }
            
            public Builder setTargetUid(final int value) {
                this.targetUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetUid() {
                this.targetUid_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureParamListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.paramList_ = GeneratedMessageV3.mutableCopy(this.paramList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getParamListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.paramList_) : this.paramList_;
            }
            
            @Override
            public int getParamListCount() {
                return this.paramList_.size();
            }
            
            @Override
            public int getParamList(final int index) {
                return this.paramList_.getInt(index);
            }
            
            public Builder setParamList(final int index, final int value) {
                this.ensureParamListIsMutable();
                this.paramList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addParamList(final int value) {
                this.ensureParamListIsMutable();
                this.paramList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllParamList(final Iterable<? extends Integer> values) {
                this.ensureParamListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.paramList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearParamList() {
                this.paramList_ = GeneratedMessageV3.emptyIntList();
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
    
    public interface TryEnterHomeRspOrBuilder extends MessageOrBuilder
    {
        int getTargetUid();
        
        int getRetcode();
        
        List<Integer> getParamListList();
        
        int getParamListCount();
        
        int getParamList(final int p0);
    }
}
