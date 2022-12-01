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

public final class GetInvestigationMonsterReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetInvestigationMonsterReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetInvestigationMonsterReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetInvestigationMonsterReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetInvestigationMonsterReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n GetInvestigationMonsterReq.proto\"O\n\u001aGetInvestigationMonsterReq\u0012\u0014\n\fcity_id_list\u0018\u0003 \u0003(\r\u0012\u001b\n\u0013Unk2700_DEMFDHNFBBJ\u0018\u0004 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetInvestigationMonsterReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GetInvestigationMonsterReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetInvestigationMonsterReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetInvestigationMonsterReqOuterClass.internal_static_GetInvestigationMonsterReq_descriptor, new String[] { "CityIdList", "Unk2700DEMFDHNFBBJ" });
    }
    
    public static final class GetInvestigationMonsterReq extends GeneratedMessageV3 implements GetInvestigationMonsterReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CITY_ID_LIST_FIELD_NUMBER = 3;
        private Internal.IntList cityIdList_;
        private int cityIdListMemoizedSerializedSize;
        public static final int UNK2700_DEMFDHNFBBJ_FIELD_NUMBER = 4;
        private boolean unk2700DEMFDHNFBBJ_;
        private byte memoizedIsInitialized;
        private static final GetInvestigationMonsterReq DEFAULT_INSTANCE;
        private static final Parser<GetInvestigationMonsterReq> PARSER;
        
        private GetInvestigationMonsterReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.cityIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private GetInvestigationMonsterReq() {
            this.cityIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.cityIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetInvestigationMonsterReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetInvestigationMonsterReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.cityIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.cityIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 26: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.cityIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.cityIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 32: {
                            this.unk2700DEMFDHNFBBJ_ = input.readBool();
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
                    this.cityIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GetInvestigationMonsterReqOuterClass.internal_static_GetInvestigationMonsterReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetInvestigationMonsterReqOuterClass.internal_static_GetInvestigationMonsterReq_fieldAccessorTable.ensureFieldAccessorsInitialized(GetInvestigationMonsterReq.class, Builder.class);
        }
        
        @Override
        public List<Integer> getCityIdListList() {
            return this.cityIdList_;
        }
        
        @Override
        public int getCityIdListCount() {
            return this.cityIdList_.size();
        }
        
        @Override
        public int getCityIdList(final int index) {
            return this.cityIdList_.getInt(index);
        }
        
        @Override
        public boolean getUnk2700DEMFDHNFBBJ() {
            return this.unk2700DEMFDHNFBBJ_;
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
            if (this.getCityIdListList().size() > 0) {
                output.writeUInt32NoTag(26);
                output.writeUInt32NoTag(this.cityIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.cityIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.cityIdList_.getInt(i));
            }
            if (this.unk2700DEMFDHNFBBJ_) {
                output.writeBool(4, this.unk2700DEMFDHNFBBJ_);
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
            for (int i = 0; i < this.cityIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.cityIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getCityIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.cityIdListMemoizedSerializedSize = dataSize;
            if (this.unk2700DEMFDHNFBBJ_) {
                size += CodedOutputStream.computeBoolSize(4, this.unk2700DEMFDHNFBBJ_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetInvestigationMonsterReq)) {
                return super.equals(obj);
            }
            final GetInvestigationMonsterReq other = (GetInvestigationMonsterReq)obj;
            return this.getCityIdListList().equals(other.getCityIdListList()) && this.getUnk2700DEMFDHNFBBJ() == other.getUnk2700DEMFDHNFBBJ() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getCityIdListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getCityIdListList().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700DEMFDHNFBBJ());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetInvestigationMonsterReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetInvestigationMonsterReq.PARSER.parseFrom(data);
        }
        
        public static GetInvestigationMonsterReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetInvestigationMonsterReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetInvestigationMonsterReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetInvestigationMonsterReq.PARSER.parseFrom(data);
        }
        
        public static GetInvestigationMonsterReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetInvestigationMonsterReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetInvestigationMonsterReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetInvestigationMonsterReq.PARSER.parseFrom(data);
        }
        
        public static GetInvestigationMonsterReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetInvestigationMonsterReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetInvestigationMonsterReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetInvestigationMonsterReq.PARSER, input);
        }
        
        public static GetInvestigationMonsterReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetInvestigationMonsterReq.PARSER, input, extensionRegistry);
        }
        
        public static GetInvestigationMonsterReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetInvestigationMonsterReq.PARSER, input);
        }
        
        public static GetInvestigationMonsterReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetInvestigationMonsterReq.PARSER, input, extensionRegistry);
        }
        
        public static GetInvestigationMonsterReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetInvestigationMonsterReq.PARSER, input);
        }
        
        public static GetInvestigationMonsterReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetInvestigationMonsterReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetInvestigationMonsterReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetInvestigationMonsterReq prototype) {
            return GetInvestigationMonsterReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetInvestigationMonsterReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetInvestigationMonsterReq getDefaultInstance() {
            return GetInvestigationMonsterReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetInvestigationMonsterReq> parser() {
            return GetInvestigationMonsterReq.PARSER;
        }
        
        @Override
        public Parser<GetInvestigationMonsterReq> getParserForType() {
            return GetInvestigationMonsterReq.PARSER;
        }
        
        @Override
        public GetInvestigationMonsterReq getDefaultInstanceForType() {
            return GetInvestigationMonsterReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetInvestigationMonsterReq();
            PARSER = new AbstractParser<GetInvestigationMonsterReq>() {
                @Override
                public GetInvestigationMonsterReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetInvestigationMonsterReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetInvestigationMonsterReqOrBuilder
        {
            private int bitField0_;
            private Internal.IntList cityIdList_;
            private boolean unk2700DEMFDHNFBBJ_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetInvestigationMonsterReqOuterClass.internal_static_GetInvestigationMonsterReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetInvestigationMonsterReqOuterClass.internal_static_GetInvestigationMonsterReq_fieldAccessorTable.ensureFieldAccessorsInitialized(GetInvestigationMonsterReq.class, Builder.class);
            }
            
            private Builder() {
                this.cityIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.cityIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetInvestigationMonsterReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.cityIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.unk2700DEMFDHNFBBJ_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetInvestigationMonsterReqOuterClass.internal_static_GetInvestigationMonsterReq_descriptor;
            }
            
            @Override
            public GetInvestigationMonsterReq getDefaultInstanceForType() {
                return GetInvestigationMonsterReq.getDefaultInstance();
            }
            
            @Override
            public GetInvestigationMonsterReq build() {
                final GetInvestigationMonsterReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetInvestigationMonsterReq buildPartial() {
                final GetInvestigationMonsterReq result = new GetInvestigationMonsterReq(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.cityIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.cityIdList_ = this.cityIdList_;
                result.unk2700DEMFDHNFBBJ_ = this.unk2700DEMFDHNFBBJ_;
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
                if (other instanceof GetInvestigationMonsterReq) {
                    return this.mergeFrom((GetInvestigationMonsterReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetInvestigationMonsterReq other) {
                if (other == GetInvestigationMonsterReq.getDefaultInstance()) {
                    return this;
                }
                if (!other.cityIdList_.isEmpty()) {
                    if (this.cityIdList_.isEmpty()) {
                        this.cityIdList_ = other.cityIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureCityIdListIsMutable();
                        this.cityIdList_.addAll(other.cityIdList_);
                    }
                    this.onChanged();
                }
                if (other.getUnk2700DEMFDHNFBBJ()) {
                    this.setUnk2700DEMFDHNFBBJ(other.getUnk2700DEMFDHNFBBJ());
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
                GetInvestigationMonsterReq parsedMessage = null;
                try {
                    parsedMessage = GetInvestigationMonsterReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetInvestigationMonsterReq)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureCityIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.cityIdList_ = GeneratedMessageV3.mutableCopy(this.cityIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getCityIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.cityIdList_) : this.cityIdList_;
            }
            
            @Override
            public int getCityIdListCount() {
                return this.cityIdList_.size();
            }
            
            @Override
            public int getCityIdList(final int index) {
                return this.cityIdList_.getInt(index);
            }
            
            public Builder setCityIdList(final int index, final int value) {
                this.ensureCityIdListIsMutable();
                this.cityIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addCityIdList(final int value) {
                this.ensureCityIdListIsMutable();
                this.cityIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllCityIdList(final Iterable<? extends Integer> values) {
                this.ensureCityIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.cityIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearCityIdList() {
                this.cityIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getUnk2700DEMFDHNFBBJ() {
                return this.unk2700DEMFDHNFBBJ_;
            }
            
            public Builder setUnk2700DEMFDHNFBBJ(final boolean value) {
                this.unk2700DEMFDHNFBBJ_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700DEMFDHNFBBJ() {
                this.unk2700DEMFDHNFBBJ_ = false;
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
    
    public interface GetInvestigationMonsterReqOrBuilder extends MessageOrBuilder
    {
        List<Integer> getCityIdListList();
        
        int getCityIdListCount();
        
        int getCityIdList(final int p0);
        
        boolean getUnk2700DEMFDHNFBBJ();
    }
}
