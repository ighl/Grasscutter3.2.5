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
import com.google.protobuf.Internal;
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

public final class GetInvestigationMonsterRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetInvestigationMonsterRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetInvestigationMonsterRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetInvestigationMonsterRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetInvestigationMonsterRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n GetInvestigationMonsterRsp.proto\u001a\u001aInvestigationMonster.proto\"w\n\u001aGetInvestigationMonsterRsp\u0012+\n\fmonster_list\u0018\n \u0003(\u000b2\u0015.InvestigationMonster\u0012\u000f\n\u0007retcode\u0018\u0001 \u0001(\u0005\u0012\u001b\n\u0013Unk2700_DEMFDHNFBBJ\u0018\u0002 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetInvestigationMonsterRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { InvestigationMonsterOuterClass.getDescriptor() });
        internal_static_GetInvestigationMonsterRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetInvestigationMonsterRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetInvestigationMonsterRspOuterClass.internal_static_GetInvestigationMonsterRsp_descriptor, new String[] { "MonsterList", "Retcode", "Unk2700DEMFDHNFBBJ" });
        InvestigationMonsterOuterClass.getDescriptor();
    }
    
    public static final class GetInvestigationMonsterRsp extends GeneratedMessageV3 implements GetInvestigationMonsterRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MONSTER_LIST_FIELD_NUMBER = 10;
        private List<InvestigationMonsterOuterClass.InvestigationMonster> monsterList_;
        public static final int RETCODE_FIELD_NUMBER = 1;
        private int retcode_;
        public static final int UNK2700_DEMFDHNFBBJ_FIELD_NUMBER = 2;
        private boolean unk2700DEMFDHNFBBJ_;
        private byte memoizedIsInitialized;
        private static final GetInvestigationMonsterRsp DEFAULT_INSTANCE;
        private static final Parser<GetInvestigationMonsterRsp> PARSER;
        
        private GetInvestigationMonsterRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetInvestigationMonsterRsp() {
            this.memoizedIsInitialized = -1;
            this.monsterList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetInvestigationMonsterRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetInvestigationMonsterRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 16: {
                            this.unk2700DEMFDHNFBBJ_ = input.readBool();
                            continue;
                        }
                        case 82: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.monsterList_ = new ArrayList<InvestigationMonsterOuterClass.InvestigationMonster>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.monsterList_.add(input.readMessage(InvestigationMonsterOuterClass.InvestigationMonster.parser(), extensionRegistry));
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
                    this.monsterList_ = Collections.unmodifiableList((List<? extends InvestigationMonsterOuterClass.InvestigationMonster>)this.monsterList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GetInvestigationMonsterRspOuterClass.internal_static_GetInvestigationMonsterRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetInvestigationMonsterRspOuterClass.internal_static_GetInvestigationMonsterRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetInvestigationMonsterRsp.class, Builder.class);
        }
        
        @Override
        public List<InvestigationMonsterOuterClass.InvestigationMonster> getMonsterListList() {
            return this.monsterList_;
        }
        
        @Override
        public List<? extends InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder> getMonsterListOrBuilderList() {
            return this.monsterList_;
        }
        
        @Override
        public int getMonsterListCount() {
            return this.monsterList_.size();
        }
        
        @Override
        public InvestigationMonsterOuterClass.InvestigationMonster getMonsterList(final int index) {
            return this.monsterList_.get(index);
        }
        
        @Override
        public InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder getMonsterListOrBuilder(final int index) {
            return this.monsterList_.get(index);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(1, this.retcode_);
            }
            if (this.unk2700DEMFDHNFBBJ_) {
                output.writeBool(2, this.unk2700DEMFDHNFBBJ_);
            }
            for (int i = 0; i < this.monsterList_.size(); ++i) {
                output.writeMessage(10, this.monsterList_.get(i));
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
                size += CodedOutputStream.computeInt32Size(1, this.retcode_);
            }
            if (this.unk2700DEMFDHNFBBJ_) {
                size += CodedOutputStream.computeBoolSize(2, this.unk2700DEMFDHNFBBJ_);
            }
            for (int i = 0; i < this.monsterList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(10, this.monsterList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetInvestigationMonsterRsp)) {
                return super.equals(obj);
            }
            final GetInvestigationMonsterRsp other = (GetInvestigationMonsterRsp)obj;
            return this.getMonsterListList().equals(other.getMonsterListList()) && this.getRetcode() == other.getRetcode() && this.getUnk2700DEMFDHNFBBJ() == other.getUnk2700DEMFDHNFBBJ() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getMonsterListCount() > 0) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getMonsterListList().hashCode();
            }
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700DEMFDHNFBBJ());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetInvestigationMonsterRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetInvestigationMonsterRsp.PARSER.parseFrom(data);
        }
        
        public static GetInvestigationMonsterRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetInvestigationMonsterRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetInvestigationMonsterRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetInvestigationMonsterRsp.PARSER.parseFrom(data);
        }
        
        public static GetInvestigationMonsterRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetInvestigationMonsterRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetInvestigationMonsterRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetInvestigationMonsterRsp.PARSER.parseFrom(data);
        }
        
        public static GetInvestigationMonsterRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetInvestigationMonsterRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetInvestigationMonsterRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetInvestigationMonsterRsp.PARSER, input);
        }
        
        public static GetInvestigationMonsterRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetInvestigationMonsterRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetInvestigationMonsterRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetInvestigationMonsterRsp.PARSER, input);
        }
        
        public static GetInvestigationMonsterRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetInvestigationMonsterRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetInvestigationMonsterRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetInvestigationMonsterRsp.PARSER, input);
        }
        
        public static GetInvestigationMonsterRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetInvestigationMonsterRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetInvestigationMonsterRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetInvestigationMonsterRsp prototype) {
            return GetInvestigationMonsterRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetInvestigationMonsterRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetInvestigationMonsterRsp getDefaultInstance() {
            return GetInvestigationMonsterRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetInvestigationMonsterRsp> parser() {
            return GetInvestigationMonsterRsp.PARSER;
        }
        
        @Override
        public Parser<GetInvestigationMonsterRsp> getParserForType() {
            return GetInvestigationMonsterRsp.PARSER;
        }
        
        @Override
        public GetInvestigationMonsterRsp getDefaultInstanceForType() {
            return GetInvestigationMonsterRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetInvestigationMonsterRsp();
            PARSER = new AbstractParser<GetInvestigationMonsterRsp>() {
                @Override
                public GetInvestigationMonsterRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetInvestigationMonsterRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetInvestigationMonsterRspOrBuilder
        {
            private int bitField0_;
            private List<InvestigationMonsterOuterClass.InvestigationMonster> monsterList_;
            private RepeatedFieldBuilderV3<InvestigationMonsterOuterClass.InvestigationMonster, InvestigationMonsterOuterClass.InvestigationMonster.Builder, InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder> monsterListBuilder_;
            private int retcode_;
            private boolean unk2700DEMFDHNFBBJ_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetInvestigationMonsterRspOuterClass.internal_static_GetInvestigationMonsterRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetInvestigationMonsterRspOuterClass.internal_static_GetInvestigationMonsterRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetInvestigationMonsterRsp.class, Builder.class);
            }
            
            private Builder() {
                this.monsterList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.monsterList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetInvestigationMonsterRsp.alwaysUseFieldBuilders) {
                    this.getMonsterListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.monsterListBuilder_ == null) {
                    this.monsterList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.monsterListBuilder_.clear();
                }
                this.retcode_ = 0;
                this.unk2700DEMFDHNFBBJ_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetInvestigationMonsterRspOuterClass.internal_static_GetInvestigationMonsterRsp_descriptor;
            }
            
            @Override
            public GetInvestigationMonsterRsp getDefaultInstanceForType() {
                return GetInvestigationMonsterRsp.getDefaultInstance();
            }
            
            @Override
            public GetInvestigationMonsterRsp build() {
                final GetInvestigationMonsterRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetInvestigationMonsterRsp buildPartial() {
                final GetInvestigationMonsterRsp result = new GetInvestigationMonsterRsp(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.monsterListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.monsterList_ = Collections.unmodifiableList((List<? extends InvestigationMonsterOuterClass.InvestigationMonster>)this.monsterList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.monsterList_ = this.monsterList_;
                }
                else {
                    result.monsterList_ = this.monsterListBuilder_.build();
                }
                result.retcode_ = this.retcode_;
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
                if (other instanceof GetInvestigationMonsterRsp) {
                    return this.mergeFrom((GetInvestigationMonsterRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetInvestigationMonsterRsp other) {
                if (other == GetInvestigationMonsterRsp.getDefaultInstance()) {
                    return this;
                }
                if (this.monsterListBuilder_ == null) {
                    if (!other.monsterList_.isEmpty()) {
                        if (this.monsterList_.isEmpty()) {
                            this.monsterList_ = other.monsterList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureMonsterListIsMutable();
                            this.monsterList_.addAll(other.monsterList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.monsterList_.isEmpty()) {
                    if (this.monsterListBuilder_.isEmpty()) {
                        this.monsterListBuilder_.dispose();
                        this.monsterListBuilder_ = null;
                        this.monsterList_ = other.monsterList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.monsterListBuilder_ = (GetInvestigationMonsterRsp.alwaysUseFieldBuilders ? this.getMonsterListFieldBuilder() : null);
                    }
                    else {
                        this.monsterListBuilder_.addAllMessages(other.monsterList_);
                    }
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                GetInvestigationMonsterRsp parsedMessage = null;
                try {
                    parsedMessage = GetInvestigationMonsterRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetInvestigationMonsterRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureMonsterListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.monsterList_ = new ArrayList<InvestigationMonsterOuterClass.InvestigationMonster>(this.monsterList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<InvestigationMonsterOuterClass.InvestigationMonster> getMonsterListList() {
                if (this.monsterListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends InvestigationMonsterOuterClass.InvestigationMonster>)this.monsterList_);
                }
                return this.monsterListBuilder_.getMessageList();
            }
            
            @Override
            public int getMonsterListCount() {
                if (this.monsterListBuilder_ == null) {
                    return this.monsterList_.size();
                }
                return this.monsterListBuilder_.getCount();
            }
            
            @Override
            public InvestigationMonsterOuterClass.InvestigationMonster getMonsterList(final int index) {
                if (this.monsterListBuilder_ == null) {
                    return this.monsterList_.get(index);
                }
                return this.monsterListBuilder_.getMessage(index);
            }
            
            public Builder setMonsterList(final int index, final InvestigationMonsterOuterClass.InvestigationMonster value) {
                if (this.monsterListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMonsterListIsMutable();
                    this.monsterList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.monsterListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setMonsterList(final int index, final InvestigationMonsterOuterClass.InvestigationMonster.Builder builderForValue) {
                if (this.monsterListBuilder_ == null) {
                    this.ensureMonsterListIsMutable();
                    this.monsterList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.monsterListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addMonsterList(final InvestigationMonsterOuterClass.InvestigationMonster value) {
                if (this.monsterListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMonsterListIsMutable();
                    this.monsterList_.add(value);
                    this.onChanged();
                }
                else {
                    this.monsterListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addMonsterList(final int index, final InvestigationMonsterOuterClass.InvestigationMonster value) {
                if (this.monsterListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMonsterListIsMutable();
                    this.monsterList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.monsterListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addMonsterList(final InvestigationMonsterOuterClass.InvestigationMonster.Builder builderForValue) {
                if (this.monsterListBuilder_ == null) {
                    this.ensureMonsterListIsMutable();
                    this.monsterList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.monsterListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addMonsterList(final int index, final InvestigationMonsterOuterClass.InvestigationMonster.Builder builderForValue) {
                if (this.monsterListBuilder_ == null) {
                    this.ensureMonsterListIsMutable();
                    this.monsterList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.monsterListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllMonsterList(final Iterable<? extends InvestigationMonsterOuterClass.InvestigationMonster> values) {
                if (this.monsterListBuilder_ == null) {
                    this.ensureMonsterListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.monsterList_);
                    this.onChanged();
                }
                else {
                    this.monsterListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearMonsterList() {
                if (this.monsterListBuilder_ == null) {
                    this.monsterList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.monsterListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeMonsterList(final int index) {
                if (this.monsterListBuilder_ == null) {
                    this.ensureMonsterListIsMutable();
                    this.monsterList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.monsterListBuilder_.remove(index);
                }
                return this;
            }
            
            public InvestigationMonsterOuterClass.InvestigationMonster.Builder getMonsterListBuilder(final int index) {
                return this.getMonsterListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder getMonsterListOrBuilder(final int index) {
                if (this.monsterListBuilder_ == null) {
                    return this.monsterList_.get(index);
                }
                return this.monsterListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder> getMonsterListOrBuilderList() {
                if (this.monsterListBuilder_ != null) {
                    return this.monsterListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder>)this.monsterList_);
            }
            
            public InvestigationMonsterOuterClass.InvestigationMonster.Builder addMonsterListBuilder() {
                return this.getMonsterListFieldBuilder().addBuilder(InvestigationMonsterOuterClass.InvestigationMonster.getDefaultInstance());
            }
            
            public InvestigationMonsterOuterClass.InvestigationMonster.Builder addMonsterListBuilder(final int index) {
                return this.getMonsterListFieldBuilder().addBuilder(index, InvestigationMonsterOuterClass.InvestigationMonster.getDefaultInstance());
            }
            
            public List<InvestigationMonsterOuterClass.InvestigationMonster.Builder> getMonsterListBuilderList() {
                return this.getMonsterListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<InvestigationMonsterOuterClass.InvestigationMonster, InvestigationMonsterOuterClass.InvestigationMonster.Builder, InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder> getMonsterListFieldBuilder() {
                if (this.monsterListBuilder_ == null) {
                    this.monsterListBuilder_ = new RepeatedFieldBuilderV3<InvestigationMonsterOuterClass.InvestigationMonster, InvestigationMonsterOuterClass.InvestigationMonster.Builder, InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder>(this.monsterList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.monsterList_ = null;
                }
                return this.monsterListBuilder_;
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
    
    public interface GetInvestigationMonsterRspOrBuilder extends MessageOrBuilder
    {
        List<InvestigationMonsterOuterClass.InvestigationMonster> getMonsterListList();
        
        InvestigationMonsterOuterClass.InvestigationMonster getMonsterList(final int p0);
        
        int getMonsterListCount();
        
        List<? extends InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder> getMonsterListOrBuilderList();
        
        InvestigationMonsterOuterClass.InvestigationMonsterOrBuilder getMonsterListOrBuilder(final int p0);
        
        int getRetcode();
        
        boolean getUnk2700DEMFDHNFBBJ();
    }
}
