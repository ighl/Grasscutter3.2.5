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

public final class GetFriendShowAvatarInfoRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetFriendShowAvatarInfoRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetFriendShowAvatarInfoRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetFriendShowAvatarInfoRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetFriendShowAvatarInfoRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n GetFriendShowAvatarInfoRsp.proto\u001a\u0014ShowAvatarInfo.proto\"j\n\u001aGetFriendShowAvatarInfoRsp\u0012\u000b\n\u0003uid\u0018\u0006 \u0001(\r\u0012\u000f\n\u0007retcode\u0018\u0003 \u0001(\u0005\u0012.\n\u0015show_avatar_info_list\u0018\t \u0003(\u000b2\u000f.ShowAvatarInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetFriendShowAvatarInfoRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ShowAvatarInfoOuterClass.getDescriptor() });
        internal_static_GetFriendShowAvatarInfoRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetFriendShowAvatarInfoRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetFriendShowAvatarInfoRspOuterClass.internal_static_GetFriendShowAvatarInfoRsp_descriptor, new String[] { "Uid", "Retcode", "ShowAvatarInfoList" });
        ShowAvatarInfoOuterClass.getDescriptor();
    }
    
    public static final class GetFriendShowAvatarInfoRsp extends GeneratedMessageV3 implements GetFriendShowAvatarInfoRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UID_FIELD_NUMBER = 6;
        private int uid_;
        public static final int RETCODE_FIELD_NUMBER = 3;
        private int retcode_;
        public static final int SHOW_AVATAR_INFO_LIST_FIELD_NUMBER = 9;
        private List<ShowAvatarInfoOuterClass.ShowAvatarInfo> showAvatarInfoList_;
        private byte memoizedIsInitialized;
        private static final GetFriendShowAvatarInfoRsp DEFAULT_INSTANCE;
        private static final Parser<GetFriendShowAvatarInfoRsp> PARSER;
        
        private GetFriendShowAvatarInfoRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetFriendShowAvatarInfoRsp() {
            this.memoizedIsInitialized = -1;
            this.showAvatarInfoList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetFriendShowAvatarInfoRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetFriendShowAvatarInfoRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 48: {
                            this.uid_ = input.readUInt32();
                            continue;
                        }
                        case 74: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.showAvatarInfoList_ = new ArrayList<ShowAvatarInfoOuterClass.ShowAvatarInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.showAvatarInfoList_.add(input.readMessage(ShowAvatarInfoOuterClass.ShowAvatarInfo.parser(), extensionRegistry));
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
                    this.showAvatarInfoList_ = Collections.unmodifiableList((List<? extends ShowAvatarInfoOuterClass.ShowAvatarInfo>)this.showAvatarInfoList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GetFriendShowAvatarInfoRspOuterClass.internal_static_GetFriendShowAvatarInfoRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetFriendShowAvatarInfoRspOuterClass.internal_static_GetFriendShowAvatarInfoRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetFriendShowAvatarInfoRsp.class, Builder.class);
        }
        
        @Override
        public int getUid() {
            return this.uid_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public List<ShowAvatarInfoOuterClass.ShowAvatarInfo> getShowAvatarInfoListList() {
            return this.showAvatarInfoList_;
        }
        
        @Override
        public List<? extends ShowAvatarInfoOuterClass.ShowAvatarInfoOrBuilder> getShowAvatarInfoListOrBuilderList() {
            return this.showAvatarInfoList_;
        }
        
        @Override
        public int getShowAvatarInfoListCount() {
            return this.showAvatarInfoList_.size();
        }
        
        @Override
        public ShowAvatarInfoOuterClass.ShowAvatarInfo getShowAvatarInfoList(final int index) {
            return this.showAvatarInfoList_.get(index);
        }
        
        @Override
        public ShowAvatarInfoOuterClass.ShowAvatarInfoOrBuilder getShowAvatarInfoListOrBuilder(final int index) {
            return this.showAvatarInfoList_.get(index);
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
            if (this.retcode_ != 0) {
                output.writeInt32(3, this.retcode_);
            }
            if (this.uid_ != 0) {
                output.writeUInt32(6, this.uid_);
            }
            for (int i = 0; i < this.showAvatarInfoList_.size(); ++i) {
                output.writeMessage(9, this.showAvatarInfoList_.get(i));
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
                size += CodedOutputStream.computeInt32Size(3, this.retcode_);
            }
            if (this.uid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.uid_);
            }
            for (int i = 0; i < this.showAvatarInfoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(9, this.showAvatarInfoList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetFriendShowAvatarInfoRsp)) {
                return super.equals(obj);
            }
            final GetFriendShowAvatarInfoRsp other = (GetFriendShowAvatarInfoRsp)obj;
            return this.getUid() == other.getUid() && this.getRetcode() == other.getRetcode() && this.getShowAvatarInfoListList().equals(other.getShowAvatarInfoListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getUid();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getRetcode();
            if (this.getShowAvatarInfoListCount() > 0) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getShowAvatarInfoListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetFriendShowAvatarInfoRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetFriendShowAvatarInfoRsp.PARSER.parseFrom(data);
        }
        
        public static GetFriendShowAvatarInfoRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetFriendShowAvatarInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetFriendShowAvatarInfoRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetFriendShowAvatarInfoRsp.PARSER.parseFrom(data);
        }
        
        public static GetFriendShowAvatarInfoRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetFriendShowAvatarInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetFriendShowAvatarInfoRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetFriendShowAvatarInfoRsp.PARSER.parseFrom(data);
        }
        
        public static GetFriendShowAvatarInfoRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetFriendShowAvatarInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetFriendShowAvatarInfoRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetFriendShowAvatarInfoRsp.PARSER, input);
        }
        
        public static GetFriendShowAvatarInfoRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetFriendShowAvatarInfoRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetFriendShowAvatarInfoRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetFriendShowAvatarInfoRsp.PARSER, input);
        }
        
        public static GetFriendShowAvatarInfoRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetFriendShowAvatarInfoRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetFriendShowAvatarInfoRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetFriendShowAvatarInfoRsp.PARSER, input);
        }
        
        public static GetFriendShowAvatarInfoRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetFriendShowAvatarInfoRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetFriendShowAvatarInfoRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetFriendShowAvatarInfoRsp prototype) {
            return GetFriendShowAvatarInfoRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetFriendShowAvatarInfoRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetFriendShowAvatarInfoRsp getDefaultInstance() {
            return GetFriendShowAvatarInfoRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetFriendShowAvatarInfoRsp> parser() {
            return GetFriendShowAvatarInfoRsp.PARSER;
        }
        
        @Override
        public Parser<GetFriendShowAvatarInfoRsp> getParserForType() {
            return GetFriendShowAvatarInfoRsp.PARSER;
        }
        
        @Override
        public GetFriendShowAvatarInfoRsp getDefaultInstanceForType() {
            return GetFriendShowAvatarInfoRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetFriendShowAvatarInfoRsp();
            PARSER = new AbstractParser<GetFriendShowAvatarInfoRsp>() {
                @Override
                public GetFriendShowAvatarInfoRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetFriendShowAvatarInfoRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetFriendShowAvatarInfoRspOrBuilder
        {
            private int bitField0_;
            private int uid_;
            private int retcode_;
            private List<ShowAvatarInfoOuterClass.ShowAvatarInfo> showAvatarInfoList_;
            private RepeatedFieldBuilderV3<ShowAvatarInfoOuterClass.ShowAvatarInfo, ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder, ShowAvatarInfoOuterClass.ShowAvatarInfoOrBuilder> showAvatarInfoListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetFriendShowAvatarInfoRspOuterClass.internal_static_GetFriendShowAvatarInfoRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetFriendShowAvatarInfoRspOuterClass.internal_static_GetFriendShowAvatarInfoRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetFriendShowAvatarInfoRsp.class, Builder.class);
            }
            
            private Builder() {
                this.showAvatarInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.showAvatarInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetFriendShowAvatarInfoRsp.alwaysUseFieldBuilders) {
                    this.getShowAvatarInfoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.uid_ = 0;
                this.retcode_ = 0;
                if (this.showAvatarInfoListBuilder_ == null) {
                    this.showAvatarInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.showAvatarInfoListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetFriendShowAvatarInfoRspOuterClass.internal_static_GetFriendShowAvatarInfoRsp_descriptor;
            }
            
            @Override
            public GetFriendShowAvatarInfoRsp getDefaultInstanceForType() {
                return GetFriendShowAvatarInfoRsp.getDefaultInstance();
            }
            
            @Override
            public GetFriendShowAvatarInfoRsp build() {
                final GetFriendShowAvatarInfoRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetFriendShowAvatarInfoRsp buildPartial() {
                final GetFriendShowAvatarInfoRsp result = new GetFriendShowAvatarInfoRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.uid_ = this.uid_;
                result.retcode_ = this.retcode_;
                if (this.showAvatarInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.showAvatarInfoList_ = Collections.unmodifiableList((List<? extends ShowAvatarInfoOuterClass.ShowAvatarInfo>)this.showAvatarInfoList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.showAvatarInfoList_ = this.showAvatarInfoList_;
                }
                else {
                    result.showAvatarInfoList_ = this.showAvatarInfoListBuilder_.build();
                }
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
                if (other instanceof GetFriendShowAvatarInfoRsp) {
                    return this.mergeFrom((GetFriendShowAvatarInfoRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetFriendShowAvatarInfoRsp other) {
                if (other == GetFriendShowAvatarInfoRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getUid() != 0) {
                    this.setUid(other.getUid());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (this.showAvatarInfoListBuilder_ == null) {
                    if (!other.showAvatarInfoList_.isEmpty()) {
                        if (this.showAvatarInfoList_.isEmpty()) {
                            this.showAvatarInfoList_ = other.showAvatarInfoList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureShowAvatarInfoListIsMutable();
                            this.showAvatarInfoList_.addAll(other.showAvatarInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.showAvatarInfoList_.isEmpty()) {
                    if (this.showAvatarInfoListBuilder_.isEmpty()) {
                        this.showAvatarInfoListBuilder_.dispose();
                        this.showAvatarInfoListBuilder_ = null;
                        this.showAvatarInfoList_ = other.showAvatarInfoList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.showAvatarInfoListBuilder_ = (GetFriendShowAvatarInfoRsp.alwaysUseFieldBuilders ? this.getShowAvatarInfoListFieldBuilder() : null);
                    }
                    else {
                        this.showAvatarInfoListBuilder_.addAllMessages(other.showAvatarInfoList_);
                    }
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
                GetFriendShowAvatarInfoRsp parsedMessage = null;
                try {
                    parsedMessage = GetFriendShowAvatarInfoRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetFriendShowAvatarInfoRsp)e.getUnfinishedMessage();
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
            public int getUid() {
                return this.uid_;
            }
            
            public Builder setUid(final int value) {
                this.uid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUid() {
                this.uid_ = 0;
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
            
            private void ensureShowAvatarInfoListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.showAvatarInfoList_ = new ArrayList<ShowAvatarInfoOuterClass.ShowAvatarInfo>(this.showAvatarInfoList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ShowAvatarInfoOuterClass.ShowAvatarInfo> getShowAvatarInfoListList() {
                if (this.showAvatarInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ShowAvatarInfoOuterClass.ShowAvatarInfo>)this.showAvatarInfoList_);
                }
                return this.showAvatarInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getShowAvatarInfoListCount() {
                if (this.showAvatarInfoListBuilder_ == null) {
                    return this.showAvatarInfoList_.size();
                }
                return this.showAvatarInfoListBuilder_.getCount();
            }
            
            @Override
            public ShowAvatarInfoOuterClass.ShowAvatarInfo getShowAvatarInfoList(final int index) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    return this.showAvatarInfoList_.get(index);
                }
                return this.showAvatarInfoListBuilder_.getMessage(index);
            }
            
            public Builder setShowAvatarInfoList(final int index, final ShowAvatarInfoOuterClass.ShowAvatarInfo value) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureShowAvatarInfoListIsMutable();
                    this.showAvatarInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.showAvatarInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setShowAvatarInfoList(final int index, final ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder builderForValue) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    this.ensureShowAvatarInfoListIsMutable();
                    this.showAvatarInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.showAvatarInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addShowAvatarInfoList(final ShowAvatarInfoOuterClass.ShowAvatarInfo value) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureShowAvatarInfoListIsMutable();
                    this.showAvatarInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.showAvatarInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addShowAvatarInfoList(final int index, final ShowAvatarInfoOuterClass.ShowAvatarInfo value) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureShowAvatarInfoListIsMutable();
                    this.showAvatarInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.showAvatarInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addShowAvatarInfoList(final ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder builderForValue) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    this.ensureShowAvatarInfoListIsMutable();
                    this.showAvatarInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.showAvatarInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addShowAvatarInfoList(final int index, final ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder builderForValue) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    this.ensureShowAvatarInfoListIsMutable();
                    this.showAvatarInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.showAvatarInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllShowAvatarInfoList(final Iterable<? extends ShowAvatarInfoOuterClass.ShowAvatarInfo> values) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    this.ensureShowAvatarInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.showAvatarInfoList_);
                    this.onChanged();
                }
                else {
                    this.showAvatarInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearShowAvatarInfoList() {
                if (this.showAvatarInfoListBuilder_ == null) {
                    this.showAvatarInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.showAvatarInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeShowAvatarInfoList(final int index) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    this.ensureShowAvatarInfoListIsMutable();
                    this.showAvatarInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.showAvatarInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder getShowAvatarInfoListBuilder(final int index) {
                return this.getShowAvatarInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ShowAvatarInfoOuterClass.ShowAvatarInfoOrBuilder getShowAvatarInfoListOrBuilder(final int index) {
                if (this.showAvatarInfoListBuilder_ == null) {
                    return this.showAvatarInfoList_.get(index);
                }
                return this.showAvatarInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ShowAvatarInfoOuterClass.ShowAvatarInfoOrBuilder> getShowAvatarInfoListOrBuilderList() {
                if (this.showAvatarInfoListBuilder_ != null) {
                    return this.showAvatarInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ShowAvatarInfoOuterClass.ShowAvatarInfoOrBuilder>)this.showAvatarInfoList_);
            }
            
            public ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder addShowAvatarInfoListBuilder() {
                return this.getShowAvatarInfoListFieldBuilder().addBuilder(ShowAvatarInfoOuterClass.ShowAvatarInfo.getDefaultInstance());
            }
            
            public ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder addShowAvatarInfoListBuilder(final int index) {
                return this.getShowAvatarInfoListFieldBuilder().addBuilder(index, ShowAvatarInfoOuterClass.ShowAvatarInfo.getDefaultInstance());
            }
            
            public List<ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder> getShowAvatarInfoListBuilderList() {
                return this.getShowAvatarInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ShowAvatarInfoOuterClass.ShowAvatarInfo, ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder, ShowAvatarInfoOuterClass.ShowAvatarInfoOrBuilder> getShowAvatarInfoListFieldBuilder() {
                if (this.showAvatarInfoListBuilder_ == null) {
                    this.showAvatarInfoListBuilder_ = new RepeatedFieldBuilderV3<ShowAvatarInfoOuterClass.ShowAvatarInfo, ShowAvatarInfoOuterClass.ShowAvatarInfo.Builder, ShowAvatarInfoOuterClass.ShowAvatarInfoOrBuilder>(this.showAvatarInfoList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.showAvatarInfoList_ = null;
                }
                return this.showAvatarInfoListBuilder_;
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
    
    public interface GetFriendShowAvatarInfoRspOrBuilder extends MessageOrBuilder
    {
        int getUid();
        
        int getRetcode();
        
        List<ShowAvatarInfoOuterClass.ShowAvatarInfo> getShowAvatarInfoListList();
        
        ShowAvatarInfoOuterClass.ShowAvatarInfo getShowAvatarInfoList(final int p0);
        
        int getShowAvatarInfoListCount();
        
        List<? extends ShowAvatarInfoOuterClass.ShowAvatarInfoOrBuilder> getShowAvatarInfoListOrBuilderList();
        
        ShowAvatarInfoOuterClass.ShowAvatarInfoOrBuilder getShowAvatarInfoListOrBuilder(final int p0);
    }
}
