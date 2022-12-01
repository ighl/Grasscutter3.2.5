// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class GetDailyDungeonEntryInfoRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetDailyDungeonEntryInfoRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetDailyDungeonEntryInfoRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetDailyDungeonEntryInfoRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetDailyDungeonEntryInfoRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n!GetDailyDungeonEntryInfoRsp.proto\u001a\u001bDailyDungeonEntryInfo.proto\"g\n\u001bGetDailyDungeonEntryInfoRsp\u00127\n\u0017daily_dungeon_info_list\u0018\u0002 \u0003(\u000b2\u0016.DailyDungeonEntryInfo\u0012\u000f\n\u0007retcode\u0018\u000e \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetDailyDungeonEntryInfoRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { DailyDungeonEntryInfoOuterClass.getDescriptor() });
        internal_static_GetDailyDungeonEntryInfoRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetDailyDungeonEntryInfoRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetDailyDungeonEntryInfoRspOuterClass.internal_static_GetDailyDungeonEntryInfoRsp_descriptor, new String[] { "DailyDungeonInfoList", "Retcode" });
        DailyDungeonEntryInfoOuterClass.getDescriptor();
    }
    
    public static final class GetDailyDungeonEntryInfoRsp extends GeneratedMessageV3 implements GetDailyDungeonEntryInfoRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int DAILY_DUNGEON_INFO_LIST_FIELD_NUMBER = 2;
        private List<DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo> dailyDungeonInfoList_;
        public static final int RETCODE_FIELD_NUMBER = 14;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final GetDailyDungeonEntryInfoRsp DEFAULT_INSTANCE;
        private static final Parser<GetDailyDungeonEntryInfoRsp> PARSER;
        
        private GetDailyDungeonEntryInfoRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetDailyDungeonEntryInfoRsp() {
            this.memoizedIsInitialized = -1;
            this.dailyDungeonInfoList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetDailyDungeonEntryInfoRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetDailyDungeonEntryInfoRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.dailyDungeonInfoList_ = new ArrayList<DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.dailyDungeonInfoList_.add(input.readMessage(DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 112: {
                            this.retcode_ = input.readInt32();
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
                    this.dailyDungeonInfoList_ = Collections.unmodifiableList((List<? extends DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo>)this.dailyDungeonInfoList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GetDailyDungeonEntryInfoRspOuterClass.internal_static_GetDailyDungeonEntryInfoRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetDailyDungeonEntryInfoRspOuterClass.internal_static_GetDailyDungeonEntryInfoRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetDailyDungeonEntryInfoRsp.class, Builder.class);
        }
        
        @Override
        public List<DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo> getDailyDungeonInfoListList() {
            return this.dailyDungeonInfoList_;
        }
        
        @Override
        public List<? extends DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfoOrBuilder> getDailyDungeonInfoListOrBuilderList() {
            return this.dailyDungeonInfoList_;
        }
        
        @Override
        public int getDailyDungeonInfoListCount() {
            return this.dailyDungeonInfoList_.size();
        }
        
        @Override
        public DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo getDailyDungeonInfoList(final int index) {
            return this.dailyDungeonInfoList_.get(index);
        }
        
        @Override
        public DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfoOrBuilder getDailyDungeonInfoListOrBuilder(final int index) {
            return this.dailyDungeonInfoList_.get(index);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            for (int i = 0; i < this.dailyDungeonInfoList_.size(); ++i) {
                output.writeMessage(2, this.dailyDungeonInfoList_.get(i));
            }
            if (this.retcode_ != 0) {
                output.writeInt32(14, this.retcode_);
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
            for (int i = 0; i < this.dailyDungeonInfoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(2, this.dailyDungeonInfoList_.get(i));
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(14, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetDailyDungeonEntryInfoRsp)) {
                return super.equals(obj);
            }
            final GetDailyDungeonEntryInfoRsp other = (GetDailyDungeonEntryInfoRsp)obj;
            return this.getDailyDungeonInfoListList().equals(other.getDailyDungeonInfoListList()) && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getDailyDungeonInfoListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getDailyDungeonInfoListList().hashCode();
            }
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetDailyDungeonEntryInfoRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetDailyDungeonEntryInfoRsp.PARSER.parseFrom(data);
        }
        
        public static GetDailyDungeonEntryInfoRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetDailyDungeonEntryInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetDailyDungeonEntryInfoRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetDailyDungeonEntryInfoRsp.PARSER.parseFrom(data);
        }
        
        public static GetDailyDungeonEntryInfoRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetDailyDungeonEntryInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetDailyDungeonEntryInfoRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetDailyDungeonEntryInfoRsp.PARSER.parseFrom(data);
        }
        
        public static GetDailyDungeonEntryInfoRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetDailyDungeonEntryInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetDailyDungeonEntryInfoRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetDailyDungeonEntryInfoRsp.PARSER, input);
        }
        
        public static GetDailyDungeonEntryInfoRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetDailyDungeonEntryInfoRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetDailyDungeonEntryInfoRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetDailyDungeonEntryInfoRsp.PARSER, input);
        }
        
        public static GetDailyDungeonEntryInfoRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetDailyDungeonEntryInfoRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetDailyDungeonEntryInfoRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetDailyDungeonEntryInfoRsp.PARSER, input);
        }
        
        public static GetDailyDungeonEntryInfoRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetDailyDungeonEntryInfoRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetDailyDungeonEntryInfoRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetDailyDungeonEntryInfoRsp prototype) {
            return GetDailyDungeonEntryInfoRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetDailyDungeonEntryInfoRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetDailyDungeonEntryInfoRsp getDefaultInstance() {
            return GetDailyDungeonEntryInfoRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetDailyDungeonEntryInfoRsp> parser() {
            return GetDailyDungeonEntryInfoRsp.PARSER;
        }
        
        @Override
        public Parser<GetDailyDungeonEntryInfoRsp> getParserForType() {
            return GetDailyDungeonEntryInfoRsp.PARSER;
        }
        
        @Override
        public GetDailyDungeonEntryInfoRsp getDefaultInstanceForType() {
            return GetDailyDungeonEntryInfoRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetDailyDungeonEntryInfoRsp();
            PARSER = new AbstractParser<GetDailyDungeonEntryInfoRsp>() {
                @Override
                public GetDailyDungeonEntryInfoRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetDailyDungeonEntryInfoRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetDailyDungeonEntryInfoRspOrBuilder
        {
            private int bitField0_;
            private List<DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo> dailyDungeonInfoList_;
            private RepeatedFieldBuilderV3<DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo, DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder, DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfoOrBuilder> dailyDungeonInfoListBuilder_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetDailyDungeonEntryInfoRspOuterClass.internal_static_GetDailyDungeonEntryInfoRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetDailyDungeonEntryInfoRspOuterClass.internal_static_GetDailyDungeonEntryInfoRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetDailyDungeonEntryInfoRsp.class, Builder.class);
            }
            
            private Builder() {
                this.dailyDungeonInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.dailyDungeonInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetDailyDungeonEntryInfoRsp.alwaysUseFieldBuilders) {
                    this.getDailyDungeonInfoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.dailyDungeonInfoListBuilder_ == null) {
                    this.dailyDungeonInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.dailyDungeonInfoListBuilder_.clear();
                }
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetDailyDungeonEntryInfoRspOuterClass.internal_static_GetDailyDungeonEntryInfoRsp_descriptor;
            }
            
            @Override
            public GetDailyDungeonEntryInfoRsp getDefaultInstanceForType() {
                return GetDailyDungeonEntryInfoRsp.getDefaultInstance();
            }
            
            @Override
            public GetDailyDungeonEntryInfoRsp build() {
                final GetDailyDungeonEntryInfoRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetDailyDungeonEntryInfoRsp buildPartial() {
                final GetDailyDungeonEntryInfoRsp result = new GetDailyDungeonEntryInfoRsp(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.dailyDungeonInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.dailyDungeonInfoList_ = Collections.unmodifiableList((List<? extends DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo>)this.dailyDungeonInfoList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.dailyDungeonInfoList_ = this.dailyDungeonInfoList_;
                }
                else {
                    result.dailyDungeonInfoList_ = this.dailyDungeonInfoListBuilder_.build();
                }
                result.retcode_ = this.retcode_;
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
                if (other instanceof GetDailyDungeonEntryInfoRsp) {
                    return this.mergeFrom((GetDailyDungeonEntryInfoRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetDailyDungeonEntryInfoRsp other) {
                if (other == GetDailyDungeonEntryInfoRsp.getDefaultInstance()) {
                    return this;
                }
                if (this.dailyDungeonInfoListBuilder_ == null) {
                    if (!other.dailyDungeonInfoList_.isEmpty()) {
                        if (this.dailyDungeonInfoList_.isEmpty()) {
                            this.dailyDungeonInfoList_ = other.dailyDungeonInfoList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureDailyDungeonInfoListIsMutable();
                            this.dailyDungeonInfoList_.addAll(other.dailyDungeonInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.dailyDungeonInfoList_.isEmpty()) {
                    if (this.dailyDungeonInfoListBuilder_.isEmpty()) {
                        this.dailyDungeonInfoListBuilder_.dispose();
                        this.dailyDungeonInfoListBuilder_ = null;
                        this.dailyDungeonInfoList_ = other.dailyDungeonInfoList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.dailyDungeonInfoListBuilder_ = (GetDailyDungeonEntryInfoRsp.alwaysUseFieldBuilders ? this.getDailyDungeonInfoListFieldBuilder() : null);
                    }
                    else {
                        this.dailyDungeonInfoListBuilder_.addAllMessages(other.dailyDungeonInfoList_);
                    }
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                GetDailyDungeonEntryInfoRsp parsedMessage = null;
                try {
                    parsedMessage = GetDailyDungeonEntryInfoRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetDailyDungeonEntryInfoRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureDailyDungeonInfoListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.dailyDungeonInfoList_ = new ArrayList<DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo>(this.dailyDungeonInfoList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo> getDailyDungeonInfoListList() {
                if (this.dailyDungeonInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo>)this.dailyDungeonInfoList_);
                }
                return this.dailyDungeonInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getDailyDungeonInfoListCount() {
                if (this.dailyDungeonInfoListBuilder_ == null) {
                    return this.dailyDungeonInfoList_.size();
                }
                return this.dailyDungeonInfoListBuilder_.getCount();
            }
            
            @Override
            public DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo getDailyDungeonInfoList(final int index) {
                if (this.dailyDungeonInfoListBuilder_ == null) {
                    return this.dailyDungeonInfoList_.get(index);
                }
                return this.dailyDungeonInfoListBuilder_.getMessage(index);
            }
            
            public Builder setDailyDungeonInfoList(final int index, final DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo value) {
                if (this.dailyDungeonInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDailyDungeonInfoListIsMutable();
                    this.dailyDungeonInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.dailyDungeonInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setDailyDungeonInfoList(final int index, final DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder builderForValue) {
                if (this.dailyDungeonInfoListBuilder_ == null) {
                    this.ensureDailyDungeonInfoListIsMutable();
                    this.dailyDungeonInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.dailyDungeonInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addDailyDungeonInfoList(final DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo value) {
                if (this.dailyDungeonInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDailyDungeonInfoListIsMutable();
                    this.dailyDungeonInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.dailyDungeonInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addDailyDungeonInfoList(final int index, final DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo value) {
                if (this.dailyDungeonInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureDailyDungeonInfoListIsMutable();
                    this.dailyDungeonInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.dailyDungeonInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addDailyDungeonInfoList(final DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder builderForValue) {
                if (this.dailyDungeonInfoListBuilder_ == null) {
                    this.ensureDailyDungeonInfoListIsMutable();
                    this.dailyDungeonInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.dailyDungeonInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addDailyDungeonInfoList(final int index, final DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder builderForValue) {
                if (this.dailyDungeonInfoListBuilder_ == null) {
                    this.ensureDailyDungeonInfoListIsMutable();
                    this.dailyDungeonInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.dailyDungeonInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllDailyDungeonInfoList(final Iterable<? extends DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo> values) {
                if (this.dailyDungeonInfoListBuilder_ == null) {
                    this.ensureDailyDungeonInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.dailyDungeonInfoList_);
                    this.onChanged();
                }
                else {
                    this.dailyDungeonInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearDailyDungeonInfoList() {
                if (this.dailyDungeonInfoListBuilder_ == null) {
                    this.dailyDungeonInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.dailyDungeonInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeDailyDungeonInfoList(final int index) {
                if (this.dailyDungeonInfoListBuilder_ == null) {
                    this.ensureDailyDungeonInfoListIsMutable();
                    this.dailyDungeonInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.dailyDungeonInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder getDailyDungeonInfoListBuilder(final int index) {
                return this.getDailyDungeonInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfoOrBuilder getDailyDungeonInfoListOrBuilder(final int index) {
                if (this.dailyDungeonInfoListBuilder_ == null) {
                    return this.dailyDungeonInfoList_.get(index);
                }
                return this.dailyDungeonInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfoOrBuilder> getDailyDungeonInfoListOrBuilderList() {
                if (this.dailyDungeonInfoListBuilder_ != null) {
                    return this.dailyDungeonInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfoOrBuilder>)this.dailyDungeonInfoList_);
            }
            
            public DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder addDailyDungeonInfoListBuilder() {
                return this.getDailyDungeonInfoListFieldBuilder().addBuilder(DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.getDefaultInstance());
            }
            
            public DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder addDailyDungeonInfoListBuilder(final int index) {
                return this.getDailyDungeonInfoListFieldBuilder().addBuilder(index, DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.getDefaultInstance());
            }
            
            public List<DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder> getDailyDungeonInfoListBuilderList() {
                return this.getDailyDungeonInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo, DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder, DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfoOrBuilder> getDailyDungeonInfoListFieldBuilder() {
                if (this.dailyDungeonInfoListBuilder_ == null) {
                    this.dailyDungeonInfoListBuilder_ = new RepeatedFieldBuilderV3<DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo, DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo.Builder, DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfoOrBuilder>(this.dailyDungeonInfoList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.dailyDungeonInfoList_ = null;
                }
                return this.dailyDungeonInfoListBuilder_;
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
    
    public interface GetDailyDungeonEntryInfoRspOrBuilder extends MessageOrBuilder
    {
        List<DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo> getDailyDungeonInfoListList();
        
        DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfo getDailyDungeonInfoList(final int p0);
        
        int getDailyDungeonInfoListCount();
        
        List<? extends DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfoOrBuilder> getDailyDungeonInfoListOrBuilderList();
        
        DailyDungeonEntryInfoOuterClass.DailyDungeonEntryInfoOrBuilder getDailyDungeonInfoListOrBuilder(final int p0);
        
        int getRetcode();
    }
}
